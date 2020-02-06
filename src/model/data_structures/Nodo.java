package model.data_structures;

public class Nodo<T> {

	/**
	 * Nodo del elemento anterior
	 */
	private Nodo<T> anterior;

	/**
	 * Nodo del elemento siguiente
	 */
	private Nodo<T> siguiente;

	/**
	 * Elemento del nodo.
	 */
	private T elemento;

	/**
	 * Método constructor, se inicializan ambos nodos en null y el elemento obtuvo el valor que llega por parámetro.
	 */
	public Nodo(T pElemento)
	{
		elemento=pElemento;
		anterior=null;
		siguiente=null;
	}

	/**
	 * Cambia el siguiente elemento en la lista
	 * @param pSiguiente  Siguiente elemento de la lista
	 */
	public void cambiarSiguiente(Nodo<T> pSiguiente) 
	{
		siguiente=pSiguiente;
	}

	/**
	 * Retorna el elemento siguiente.
	 * @return Retorna el elemento siguiente
	 */
	public Nodo<T> darSiguiente()
	{
		return siguiente;
	}

	/**
	 * Cambia el anterior elemento en la lista
	 * @param pAnterior  Siguiente elemento de la lista
	 */
	public void cambiarAnterior(Nodo<T> pAnterior) 
	{
		anterior=pAnterior;
	}

	/**
	 * Retorna el elemento anterior.	
	 * @return Retorna el elemento anterior.
	 */
	public Nodo<T> darAnterior()
	{
		return siguiente;
	}

	/**
	 * Retorna el elemento del arreglo.
	 * @return Retorna el elemento del arreglo.
	 */
	public T darElemento()
	{
		return elemento;
	}

}
