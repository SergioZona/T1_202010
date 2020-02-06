package model.data_structures;

import java.util.Iterator;

import model.logic.Comparendo;

public class ListaGenerica<T extends Comparable<T>> implements IListaGenerica<T>
{
	/**
	 * Nodo que maneja el primer elemento de la lista.
	 */
	Nodo<T> primero;

	/**
	 * Nodo que maneja el �ltimo elemento de la lista.
	 */
	Nodo<T> ultimo;

	/**
	 * M�todo constructor
	 */
	public ListaGenerica()
	{
		primero=null;
		ultimo=null;
	}

	/**
	 * M�todo que agrega un elemento a la lista.
	 * @param pAgregado Elemento a agregar que ingresa por par�metro
	 */
	public void agregarElemento(T pAgregado) {
		Nodo<T>agregado=new Nodo<T>(pAgregado);
		Nodo<T>actual=primero;

		//AGREGAR EN EL �LTIMO NODO
		if(ultimo!=null)
		{
			ultimo.cambiarSiguiente(agregado);
			agregado.cambiarAnterior(ultimo);
			ultimo=agregado; 
			return;
		}

		//AGREGAR EN PRIMERA POSICI�N
		if(primero==null)
		{
			primero=agregado;
			ultimo=primero;
			return;
		}

		//CASO INTERMEDIO, O QUE NO EXISTA EL �LTIMO
		while(actual!=null)
		{
			if(actual.darSiguiente()==null)
			{
				actual.cambiarSiguiente(agregado);
				agregado.cambiarAnterior(actual);
				ultimo=agregado;
				return;
			}
			actual=actual.darSiguiente();
		}
	}

	/**
	 * M�todo que elimina un elemento de la lista
	 * @param pEliminado Elemento que es eliminado de la lista por par�metro.
	 */
	public void eliminarElemento(T pEliminado) {
		Nodo<T>eliminado=new Nodo<T>(pEliminado);
		Nodo<T>actual=primero;
		//CASO PRIMER ELEMENTO
		if(primero==eliminado)
		{
			Nodo<T>siguienteTemp=primero.darSiguiente();
			primero=siguienteTemp;
			if(primero!=null)
			{
				primero.cambiarAnterior(null);
			}
		}

		//RESTO DE CASOS
		boolean encontrado=false;
		while(encontrado==false || actual!=null)
		{
			if(actual.darSiguiente()==eliminado)
			{
				Nodo<T>siguienteSiguiente=actual.darSiguiente().darSiguiente();
				actual.cambiarSiguiente(actual.darSiguiente().darSiguiente());
				if(siguienteSiguiente!=null)
				{
					siguienteSiguiente.cambiarAnterior(actual);
				}
				encontrado=true;
			}
		}
	}

	/**
	 * Retorna el n�mero de elementos de la lista.
	 * @return Total de elementos.
	 */
	public int darTamanoLista() {
		Nodo<T>actual=primero;
		int contador=0;
		while(actual!=null)
		{
			contador+=1;
			actual=actual.darSiguiente();
		}
		return contador;
	}

	/**
	 * M�todo que busca un elemento gen�rico en la lista
	 * @param pBuscado Elemento buscado.
	 * @return Retorna el elemento.
	 */
	public T buscarElemento(T pBuscado) {
		Nodo<T> buscado=new Nodo<T>(pBuscado);
		Nodo<T> actual=primero;
		while(actual!=null)
		{
			if(actual.hashCode()==(buscado.hashCode()))
			{
				return buscado.darElemento();
			}
			actual=actual.darSiguiente();
		}

		return null;
	}

	/**
	 * Retorna el primer nodo.
	 * @return Retorna el primer nodo.
	 */
	public Nodo<T> darPrimero()
	{
		return primero;
	}

	/**
	 * Retorn el primer nodo.
	 * @return Retorna el primer nodo.
	 */
	public Nodo<T> darUltimo()
	{
		return ultimo;
	}

	/**
	 * M�todo que retorna un elemento seg�n posici�n.
	 * @param Posici�n de un elemento de la lista.
	 */
	public T buscarElementoPosicion(int pPosicion)
	{

		Nodo<T>actual=primero;
		int contador=1;
		while(actual!=null)
		{
			if(contador==pPosicion)
			{
				return actual.darElemento();
			}
		}
		return null;
	}
}
