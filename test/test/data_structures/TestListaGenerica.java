package test.data_structures;

import model.data_structures.ListaGenerica;
import model.logic.Comparendo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestListaGenerica {

	/**
	 * Atributo que tiene la lista genérica de comparendos.
	 */
	private ListaGenerica<Comparendo> lista;

	/**
	 * Comparendos de prueba
	 */
	Comparendo prueba0=new Comparendo("1", "10/12/2020" ,"La embarró", "Carro", "Particular", "Chapinero", new double[3] , "Boom");
	Comparendo prueba1=new Comparendo("2", "10/12/2020" ,"La embarró", "Carro", "Particular", "Chapinero", new double[3] , "Boom");
	Comparendo prueba2=new Comparendo("3", "10/12/2020" ,"La embarró", "Carro", "Particular", "Chapinero", new double[3] , "Boom");
	Comparendo prueba3=new Comparendo("4", "10/12/2020" ,"La embarró", "Carro", "Particular", "Chapinero", new double[3] , "Boom");

	@Before
	/**
	 * Escenario 1 que inicializa la lista.
	 */
	public void setUp1() {
		lista=new ListaGenerica<Comparendo>();

	}

	@Test
	/**
	 * Test que comprueba si se agrega correctamente el elemento.
	 */
	public void testAgregarLista() {
		// TODO
		setUp1();
		lista.agregarElemento(prueba0);
		assertEquals(1, lista.darTamanoLista()); 
		lista.agregarElemento(prueba1);
		assertEquals(2, lista.darTamanoLista()); 
		lista.agregarElemento(prueba2);
		assertEquals(3, lista.darTamanoLista()); 
		lista.agregarElemento(prueba3);
		assertEquals(4, lista.darTamanoLista()); 
	}

	@Test
	/**
	 * Test que comprueba
	 */
	public void testBuscarElementoPosicion() 
	{

		setUp1();
		lista.agregarElemento(prueba0);
		lista.agregarElemento(prueba1);
		lista.agregarElemento(prueba2);
		lista.agregarElemento(prueba3);

		assertEquals(prueba0, lista.buscarElementoPosicion(1)); 
		assertEquals(prueba1, lista.buscarElementoPosicion(2)); 
		assertEquals(prueba2, lista.buscarElementoPosicion(3));  
		assertEquals(prueba3, lista.buscarElementoPosicion(4)); 

	}
	
	public void testEliminarElemento()
	{
		//ELIMINAR ELEMENTO INTERMEDIO
		lista.eliminarElemento(prueba2);
		assertEquals(3, lista.darTamanoLista()); 
		//ELIMINAR ELEMENTO AL FINAL
		lista.eliminarElemento(prueba3);
		assertEquals(2, lista.darTamanoLista()); 
		//ELIMINAR ELEMENTO EL PRIMER ELEMENTO
		lista.eliminarElemento(prueba0);
		assertEquals(1, lista.darTamanoLista()); 
		//ELIMINAR EL ÚNICO ELEMENTO EN LA LISTA
		lista.eliminarElemento(prueba1);
		assertEquals(0, lista.darTamanoLista()); 
	}
	

}
