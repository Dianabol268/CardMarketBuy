package com.capgemaniac.ServiciosNegocio.Arquitectura;

/**
 * Clase abstracta de la que heredan todos los objetos que han de ser pasados como par�metro
 * @author Astur
 *
 */
public abstract class InputServicioNegocio {

	protected String descriptor;
	protected Exception error;

	public abstract void setDescriptor();

}
