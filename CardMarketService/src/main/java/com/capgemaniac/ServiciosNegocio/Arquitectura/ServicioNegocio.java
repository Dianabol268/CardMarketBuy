package com.capgemaniac.ServiciosNegocio.Arquitectura;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.capgemaniac.util.Utilidades;

//implementamos una llamada gen�rica para todos los Servicios
	//cada Servicio de negocio tiene que tener un objeto de entrada propio. o usar uno generico
	// la nomenclatura ser�: Input.... para el objeto y SN... para el servicio

public abstract class ServicioNegocio {

	public int idServicio;
	public Object entradaServicio;
	FileHandler fh;


	public static final Logger log = Logger.getLogger(ServicioNegocio.class.getName());

	 /**
     * Método que ejecuta la lógica del servicio de negocio.
     *
     * @return resultado de salida (un objeto TO.OUT)
	 * @throws Exception 
     */
	protected abstract OutputServicioNegocio llamadaServicio();

	/**
	 * Metodo generico al que SIEMPRE hay que llamar para invocar un servicio
	 * @param entradaServicio
	 * @return salidaServicio
	 */
	public final OutputServicioNegocio llamadaServicio(InputServicioNegocio entradaServicioObj) {
		//logs
		try {
			fh = new FileHandler("logsServicio.log");
			//no deberia darse
		} catch (Exception e) {
		}
        log.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
		//seteamos la entrada, para que sea visible en las clases hijas a traves del campo
		this.setEntradaServicio(entradaServicioObj);

		//hacemos la llamada al metodo implementado por cada clase hija
		OutputServicioNegocio salida=null;
		try {
			 salida= llamadaServicio();
		}
		catch(Exception error) {
			Utilidades.escribirLogError("Se ha producido un error en la invocacion del servicio Id: " +
					idServicio + " Se procede con el Rollback de la llamada");
			
			Utilidades.escribirLogError("Detalles del error: "+ error.getMessage() +
					"////Causa: ");
			
			for(Object item: error.getStackTrace()) {
				Utilidades.escribirLogError(item.toString());
			}
			

			//TODO rollback base de datos
			//devolvemos el error
			 salida = new OutputServicioNegocio() ;
			 salida.setError(error);
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
