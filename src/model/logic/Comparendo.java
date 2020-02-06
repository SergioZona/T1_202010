package model.logic;

public class Comparendo implements Comparable<Comparendo> {

	/**
	 * Atributos de la clase.
	 */

	/**
	 * Atributo que tiene el ID del comparendo.
	 */
	private String objectID;

	/**
	 * Atributo que tiene la fecha y hora del comparendo.
	 */
	private String fechaHora;

	/**
	 * Atributo que tiene la infracci�n del comparendo.
	 */
	private String infraccion;

	/**
	 * Atributo que tiene la clase de veh�culo que recibi� el comparendo.
	 */
	private String clase;

	/**
	 * Atributo que tiene el tipo de Servicio.
	 */
	private String tipoServicio;

	/**
	 * Atributo que tiene el lugar donde di� el comparendo.
	 */
	private String localidad;

	/**
	 * Arreglo que maneja las coordenadas.
	 */
	private double[]coordenadas;

	/**
	 * Atributo que tiene la descripci�n del comparendo.
	 */
	private String descripcion;
	/**
	 * Constructor, inicializa todos los datos del comparendo.
	 * @param pObjectID Par�metro que tiene el id.
	 * @param pFecha Par�metro que tiene la fecha.
	 * @param pInfraccion Par�metro que tiene la infracci�n.
	 * @param pClase Par�metro que tiene la clase.
	 * @param pTipoServicio Par�metro que tiene el tipo de servicio.
	 * @param pLocalidad Par�metro que tiene la localidad.
	 * @param pCoordenadas Arreglo de double que tiene las coordenadas del comparendo.
	 * @param pDescripion Par�metro que tiene la descripci�n del comparendo.
	 */
	public Comparendo(String pObjectID, String pFecha, String pInfraccion, String pClase, String pTipoServicio, String pLocalidad, double[]pCoordenadas, String pDescripcion) 
	{
		objectID=pObjectID;
		fechaHora=pFecha;
		infraccion=pInfraccion;
		clase=pClase;
		tipoServicio=pTipoServicio;
		localidad=pLocalidad;
		coordenadas=pCoordenadas;
		descripcion=pDescripcion;
	}

	/**
	 * Retorna el ID del comparendo.
	 * @return Retorna el ID del comparendo.
	 */
	public String darID()
	{
		return objectID;
	}

	/**
	 * Retorna la fecha y hora del comparendo.
	 * @return Retorna la fecha y hora del comparendo.
	 */
	public String darFechaHora()
	{
		return fechaHora;
	}

	/**
	 * Retorna la infracci�n del comparendo.
	 * @return Retorna la infracci�n del comparendo.
	 */
	public String darInfraccion()
	{
		return infraccion;
	}

	/**
	 * Retorna la del comparendo.
	 * @return Retorna el ID del comparendo.
	 */
	public String darClase()
	{
		return clase;
	}

	/**
	 * Retorna el tipo de servicio que ofrec�a el veh�culo del comparendo.
	 * @return Retorna el tipo de servicio que ofrec�a el veh�culo del comparendo.
	 */
	public String darTipoServicio()
	{
		return tipoServicio;
	}

	/**
	 * Retorna la localidad donde se realiz� el comparendo.
	 * @return Retorna la localidad donde se realiz� el comparendo.
	 */
	public String darLocalidad()
	{
		return localidad;
	}

	/**
	 * Retorna el arreglo con las coordenadas del comparendo.
	 * @return Coordenadas del comparendo.
	 */
	public double[] darCoordenadas()
	{
		return coordenadas;
	}

	/**
	 * Retorna la descripci�n del comparendo.
	 * @return Descripci�n del comparendo.
	 */
	public String darDescripcion()
	{
		return descripcion;
	}

	/**
	 * M�todo que compara los comparendo seg�n ID
	 */
	public int compareTo(Comparendo o) {
		return 0;
	}




}
