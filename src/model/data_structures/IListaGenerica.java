package model.data_structures;

import model.logic.Comparendo;

public interface IListaGenerica<T extends Comparable<T>> 
{
	/**
	 * M�todo que agrega un elemento a la lista.
	 * @param pAgregado Elemento a agregar que ingresa por par�metro
	 */
	public void agregarElemento(T pAgregado);

	/**
	 * M�todo que elimina un elemento de la lista
	 * @param pEliminado Elemento que es eliminado de la lista por par�metro.
	 */
	public void eliminarElemento(T pEliminado);

	/**
	 * Retorna el n�mero de elementos de la lista.
	 * @return Total de elementos.
	 */
	public int darTamanoLista();

	/**
	 * M�todo que busca un elemento gen�rico en la lista
	 * @param pBuscado Elemento buscado.
	 * @return Retorna el elemento.
	 */
	public T buscarElemento(T pBuscado);

}
