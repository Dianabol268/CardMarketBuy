package com.capgemaxi.ServiciosNegocio;

import com.capgemaxi.ServiciosNegocio.Arquitectura.OutputServicioNegocio;
import com.capgemaxi.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaxi.ServiciosNegocio.TO.IN.InputObtenerPrecioColeccion;


/**
 * Servicio que pasandole como par�metro una List<Strings> que seran nombres de cartas
 * para todas las cartas que encuentre en la llamada al webservice calculara su precio
 * @return listadoConPrecio
 * @author Saul Blanco
 *
 */
public class SNObtenerPrecioColeccion extends ServicioNegocio{

	@Override
	public OutputServicioNegocio llamadaServicio() {
		log.info("Inicio- SNObtenerPrecioColeccion");
		//primero inicializamos el objeto de entrada de arquitectura, con el cast Necesario
		InputObtenerPrecioColeccion entrada = (InputObtenerPrecioColeccion) this.getEntradaServicio();



		log.info("Inicio- SNObtenerPrecioColeccion");
		return null;

	}

	@Override
	protected void setIdServicio(int IdServicio) {
		this.setIdServicio(1);
	}

}
