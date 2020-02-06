package view;

import model.logic.Modelo;

public class View 
{
	/**
	 * Metodo constructor
	 */
	public View()
	{

	}

	/**
	 * Método que imprime el menú inicial.
	 */
	public void printMenu()
	{
		System.out.println("1. Solicitar el primer y último comparendo de la lista, además del tamaño de la lista.");
		System.out.println("2. Buscar un Comparendo por ID");
		System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
	}

	/**
	 * Método que imprime un mensaje que llega por parámetro.
	 * @param mensaje Mensaje que llega por parámetro.
	 */
	public void printMessage(String mensaje) {

		System.out.println(mensaje);
	}		
}
