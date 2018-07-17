package com.capgemaxi.ServiciosNegocio.Arquitectura;

public abstract class OutputServicioNegocio {

	protected Exception error;



	public Exception getError() {
		return error;
	}

	public void setError(Exception error) {
		this.error = error;
	}


}
