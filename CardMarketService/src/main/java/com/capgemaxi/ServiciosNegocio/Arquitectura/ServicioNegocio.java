package com.capgemaxi.ServiciosNegocio.Arquitectura;

import java.util.logging.Logger;

//implementamos una llamada genérica para todos los Servicios
	//cada Servicio de negocio tiene que tener un objeto de entrada propio. o usar uno generico
	// la nomenclatura será: Input.... para el objeto y SN... para el servicio

public abstract class ServicioNegocio {
	
	int idServicio;
	public static final Logger log = Logger.getLogger(ServicioNegocio.class.getName());	
	
	protected abstract Object llamadaServicio(Object entradaServicio);
	protected abstract void setIdServicio(int idServicio);
}
