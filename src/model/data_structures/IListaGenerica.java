package model.data_structures;

import model.logic.Comparendo;

public interface IListaGenerica<T extends Comparable<T>> 
{
	/**
	 * Método que agrega un elemento a la lista.
	 * @param pAgregado Elemento a agregar que ingresa por parámetro
	 */
	public void agregarElemento(T pAgregado);

	/**
	 * Método que elimina un elemento de la lista
	 * @param pEliminado Elemento que es eliminado de la lista por parámetro.
	 */
	public void eliminarElemento(T pEliminado);

	/**
	 * Retorna el número de elementos de la lista.
	 * @return Total de elementos.
	 */
	public int darTamanoLista();

	/**
	 * Método que busca un elemento genérico en la lista
	 * @param pBuscado Elemento buscado.
	 * @return Retorna el elemento.
	 */
	public T buscarElemento(T pBuscado);

}
