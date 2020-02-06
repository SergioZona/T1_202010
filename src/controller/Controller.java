package controller;

import java.io.IOException;
import java.util.Scanner;

import model.logic.Comparendo;
import model.logic.Modelo;
import view.View;

public class Controller <T extends Comparable<T>>{

	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}

	/**
	 * Método que corre la aplicación
	 */
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		int dato;
		T respuesta;

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
			case 1:
				try {
					modelo.cargarDatos();

					int contador=1;
					Comparendo primero=(Comparendo) modelo.darPrimero().darElemento();
					Comparendo ultimo=(Comparendo) modelo.darUltimo().darElemento();
					System.out.println("PRIMER COMPARENDO"+"\n"+
							"ID: "+primero.darID()+"\n"+
							"Fecha y hora: "+primero.darFechaHora()+"\n"+
							"Clase: "+primero.darClase()+"\n"+
							"Tipo servicio: "+ primero.darTipoServicio()+"\n"+
							"Descripcion: "+primero.darDescripcion()+"\n"+
							"Localidad: "+ primero.darLocalidad()+"\n"+
							"Ubicacion: [ " +primero.darCoordenadas()[0]+" ,"+primero.darCoordenadas()[1] +" ,"+primero.darCoordenadas()[2]+"] \n"+"\n");
					System.out.println("ÚLTIMO COMPARENDO"+"\n"+
							"ID: "+ultimo.darID()+"\n"+
							"Fecha y hora: "+ultimo.darFechaHora()+"\n"+
							"Clase: "+ultimo.darClase()+"\n"+
							"Tipo servicio: "+ ultimo.darTipoServicio()+"\n"+
							"Descripcion: "+ultimo.darDescripcion()+"\n"+
							"Localidad: "+ ultimo.darLocalidad()+"\n"+
							"Ubicacion: [ " +ultimo.darCoordenadas()[0]+" ,"+ultimo.darCoordenadas()[1] +" ,"+ultimo.darCoordenadas()[2]+"] \n"+"\n");

					System.out.println("NÚMERO TOTAL DE COMPARENDO: "+modelo.darTamano()+"\n"+ "\n");

				} catch (IOException e) {

				}

				break;

			case 2:
				try {
					modelo.cargarDatos();

					int id=lector.nextInt();
					Comparendo buscado=modelo.buscarElemento(id);
					if(buscado!=null)
					{
						System.out.println("ÚLTIMO COMPARENDO"+"\n"+
								"ID: "+buscado.darID()+"\n"+
								"Fecha y hora: "+buscado.darFechaHora()+"\n"+
								"Clase: "+buscado.darClase()+"\n"+
								"Tipo servicio: "+ buscado.darTipoServicio()+"\n"+
								"Descripcion: "+buscado.darDescripcion()+"\n"+
								"Localidad: "+ buscado.darLocalidad()+"\n"+
								"Ubicacion: [ " +buscado.darCoordenadas()[0]+" ,"+buscado.darCoordenadas()[1] +" ,"+buscado.darCoordenadas()[2]+"] \n"+"\n");
					}
					else 
					{
						System.out.println("No se ha encontrado un comparendo con ID: "+id+"\n"+"\n");
					}

				} catch (IOException e) {

				}
				break;

			default: 
				view.printMessage("--------- \n Opcion Invalida !! \n---------");
				break;
			}
		}

	}	
}
