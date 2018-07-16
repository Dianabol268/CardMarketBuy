package com.capgemaxi.ServiciosNegocio;

import com.capgemaxi.ServiciosNegocio.Arquitectura.ServicioNegocio;


/**
 * Servicio que pasandole como parámetro una List<Strings> que seran nombres de cartas 
 * para todas las cartas que encuentre en la llamada al webservice calculara su precio
 * @return listadoConPrecio
 * @author Saúl Blanco
 *
 */
public class SNObtenerPrecioColeccion extends ServicioNegocio{
	
	@Override
	public Object llamadaServicio(Object entradaNegocio) {
		log.info("Inicio- SNObtenerPrecioColeccion");
	//	entradaNegocio
		
		
		
		log.info("Inicio- SNObtenerPrecioColeccion");
		return null;
		
	}

	@Override
	protected void setIdServicio(int IdServicio) {
		this.setIdServicio(1);		
	}
	
}
