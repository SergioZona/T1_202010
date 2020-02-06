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
	 * Atributo que tiene la infracción del comparendo.
	 */
	private String infraccion;

	/**
	 * Atributo que tiene la clase de vehículo que recibió el comparendo.
	 */
	private String clase;

	/**
	 * Atributo que tiene el tipo de Servicio.
	 */
	private String tipoServicio;

	/**
	 * Atributo que tiene el lugar donde dió el comparendo.
	 */
	private String localidad;

	/**
	 * Arreglo que maneja las coordenadas.
	 */
	private double[]coordenadas;

	/**
	 * Atributo que tiene la descripción del comparendo.
	 */
	private String descripcion;
	/**
	 * Constructor, inicializa todos los datos del comparendo.
	 * @param pObjectID Parámetro que tiene el id.
	 * @param pFecha Parámetro que tiene la fecha.
	 * @param pInfraccion Parámetro que tiene la infracción.
	 * @param pClase Parámetro que tiene la clase.
	 * @param pTipoServicio Parámetro que tiene el tipo de servicio.
	 * @param pLocalidad Parámetro que tiene la localidad.
	 * @param pCoordenadas Arreglo de double que tiene las coordenadas del comparendo.
	 * @param pDescripion Parámetro que tiene la descripción del comparendo.
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
	 * Retorna la infracción del comparendo.
	 * @return Retorna la infracción del comparendo.
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
	 * Retorna el tipo de servicio que ofrecía el vehículo del comparendo.
	 * @return Retorna el tipo de servicio que ofrecía el vehículo del comparendo.
	 */
	public String darTipoServicio()
	{
		return tipoServicio;
	}

	/**
	 * Retorna la localidad donde se realizó el comparendo.
	 * @return Retorna la localidad donde se realizó el comparendo.
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
	 * Retorna la descripción del comparendo.
	 * @return Descripción del comparendo.
	 */
	public String darDescripcion()
	{
		return descripcion;
	}

	/**
	 * Método que compara los comparendo según ID
	 */
	public int compareTo(Comparendo o) {
		return 0;
	}




}
