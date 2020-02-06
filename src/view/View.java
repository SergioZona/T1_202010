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
	 * M�todo que imprime el men� inicial.
	 */
	public void printMenu()
	{
		System.out.println("1. Solicitar el primer y �ltimo comparendo de la lista, adem�s del tama�o de la lista.");
		System.out.println("2. Buscar un Comparendo por ID");
		System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
	}

	/**
	 * M�todo que imprime un mensaje que llega por par�metro.
	 * @param mensaje Mensaje que llega por par�metro.
	 */
	public void printMessage(String mensaje) {

		System.out.println(mensaje);
	}		
}
