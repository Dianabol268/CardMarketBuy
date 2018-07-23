package com.capgemaxi.ServiciosNegocio;

import com.capgemaxi.ServiciosNegocio.Arquitectura.OutputServicioNegocio;
import com.capgemaxi.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaxi.util.Utilidades;

public class SNAgregarColeccionVender extends ServicioNegocio{


	@Override
	protected OutputServicioNegocio llamadaServicio() {
		Utilidades.escribirLogInfo("Inicio- SNAgregarCartaVender", log);
		return null;
	}



	@Override
	protected void setIdServicio(int idServicio) {
		this.setIdServicio(2);

	}

}
