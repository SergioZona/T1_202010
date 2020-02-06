package model.logic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import model.data_structures.IListaGenerica;
import model.data_structures.ListaGenerica;
import model.data_structures.Nodo;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo <T extends Comparable<T>> {
	/**
	 * Atributo de la lista genérica con Objeto Comparendo
	 */
	private ListaGenerica<Comparendo> datos;

	/**
	 * Atributo del primer nodo.
	 */
	private Nodo<Comparendo> primero;

	/**
	 * Atributo del ultimo nodo.
	 */
	private Nodo<Comparendo> ultimo;

	/**
	 * Constructor del modelo del mundo con capacidad predefinida, inicializa la lista.
	 */
	public Modelo()
	{
		datos=new ListaGenerica<Comparendo>();
	}

	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamanoLista();
	}

	/**
	 * Retorna el primer nodo.
	 * @return retorna el primer nodo.
	 */
	public Nodo<Comparendo> darPrimero()
	{
		return primero;
	}

	/**
	 * Retorn el ultimo nodo.
	 * @return retorna el ultimo nodo.
	 */
	public Nodo<Comparendo> darUltimo()
	{
		return ultimo;
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(Comparendo pAgregado)
	{	
		datos.agregarElemento(pAgregado);
	}

	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public void eliminar(Comparendo dato)
	{
		datos.eliminarElemento(dato);
	}

	/**
	 * Comparador natural de la clase implementada.
	 * @param arg0
	 * @return Valor comparado; aún no se ha implementado.
	 */
	public int compareTo(Integer arg0) {

		return 0;
	}

	/**
	 * Carga los datos del archivo geojson
	 * @throws IOException Si no se pudo leer el archivo.
	 */

	public void cargarDatos() throws IOException
	{
		File nuevo = new File("./data/comparendos_dei_2018_small.geojson");
		JsonReader js= new JsonReader(new FileReader(nuevo));
		JsonObject objeto= JsonParser.parseReader(js).getAsJsonObject();
		JsonArray arreglo= objeto.get("features").getAsJsonArray();

		for(int i=0; i<arreglo.size(); i++)
		{
			JsonObject objetoInterno=arreglo.get(i).getAsJsonObject();
			JsonObject valores= objetoInterno.getAsJsonObject();
			JsonObject propiedadesInternas= valores.get("properties").getAsJsonObject();

			String objectID=propiedadesInternas.get("OBJECTID").getAsString();
			String fechaHora=propiedadesInternas.get("FECHA_HORA").getAsString();
			String clase=propiedadesInternas.get("CLASE_VEHI").getAsString();
			String servicio=propiedadesInternas.get("TIPO_SERVI").getAsString();
			String infraccion=propiedadesInternas.get("INFRACCION").getAsString();
			String localidad=propiedadesInternas.get("LOCALIDAD").getAsString();
			String descripcion=propiedadesInternas.get("DES_INFRAC").getAsString();
			JsonObject propiedadesInternas2=valores.get("geometry").getAsJsonObject();
			JsonArray coordenadas=propiedadesInternas2.get("coordinates").getAsJsonArray();

			double[]valoresCoordenadas=new double[3];
			valoresCoordenadas[0]=coordenadas.get(0).getAsDouble();
			valoresCoordenadas[1]=coordenadas.get(1).getAsDouble();
			valoresCoordenadas[2]=coordenadas.get(2).getAsDouble();

			Comparendo comparendo = new Comparendo(objectID, fechaHora, infraccion, clase, servicio, localidad, valoresCoordenadas, descripcion);

			agregar(comparendo);

		}
		primero=datos.darPrimero();
		ultimo=datos.darUltimo();
	}

	/**
	 * Busca un comparendo según la ID que llega por parámetro, si no se encuentra el comparendo retorna null.
	 * @param pBuscado ID del comparendo buscado.
	 * @return Comparendo buscado.
	 */
	public Comparendo buscarElemento(int pBuscado) {

		Nodo<Comparendo>actual=primero;
		while(actual!=null)
		{
			if(actual.darElemento().darID().equals(Integer.toString(pBuscado)))
			{
				return actual.darElemento();
			}
			actual=actual.darSiguiente();
		}

		return null;
	}
}


