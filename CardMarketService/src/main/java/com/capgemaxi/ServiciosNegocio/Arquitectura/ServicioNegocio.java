package com.capgemaxi.ServiciosNegocio.Arquitectura;

import java.util.logging.Level;
import java.util.logging.Logger;

//implementamos una llamada gen�rica para todos los Servicios
	//cada Servicio de negocio tiene que tener un objeto de entrada propio. o usar uno generico
	// la nomenclatura ser�: Input.... para el objeto y SN... para el servicio

public abstract class ServicioNegocio {

	public int idServicio;
	public Object entradaServicio;

	public static final Logger log = Logger.getLogger(ServicioNegocio.class.getName());

	 /**
     * Método que ejecuta la lógica del servicio de negocio.
     *
     * @return resultado de salida (un objeto TO.OUT)
     */
	protected abstract OutputServicioNegocio llamadaServicio();

	/**
	 * Metodo generico al que SIEMPRE hay que llamar para invocar un servicio
	 * @param entradaServicio
	 * @return salidaServicio
	 */
	public final OutputServicioNegocio llamadaServicio(InputServicioNegocio entradaServicioObj) {
		//seteamos la entrada, para que sea visible en las clases hijas a traves del campo
		this.setEntradaServicio(entradaServicioObj);

		//hacemos la llamada al metodo implementado por cada clase hija
		OutputServicioNegocio salida=null;
		try {
			 salida= llamadaServicio();
		}
		catch(Exception error) {
			log.log(Level.SEVERE, "Se ha producido un error en la invocacion del servicio Id: " +
					idServicio + " Se procede con el Rollback de la llamada");

			log.log(Level.SEVERE, "Detalles del error: "+ error.getMessage() +
					"////Causa: " + error.getCause());

			//TODO rollback base de datos
		}

		return salida;

	}


	//setters getters genericos de la clase
	public Object getEntradaServicio() {
		return entradaServicio;
	}
	public void setEntradaServicio(Object entradaServicio) {
		this.entradaServicio = entradaServicio;
	}
	public int getIdServicio() {
		return idServicio;
	}

	protected abstract void setIdServicio(int idServicio);

}
