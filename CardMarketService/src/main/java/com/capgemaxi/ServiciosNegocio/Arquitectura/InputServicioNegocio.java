package com.capgemaxi.ServiciosNegocio.Arquitectura;

/**
 * Clase abstracta de la que heredan todos los objetos que han de ser pasados como parámetro
 * @author Astur
 *
 */
public abstract class InputServicioNegocio {
	
	protected String descriptor;
	
	public abstract void setDescriptor();
	
}
