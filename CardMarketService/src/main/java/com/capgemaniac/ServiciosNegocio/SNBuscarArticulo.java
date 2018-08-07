package com.capgemaniac.ServiciosNegocio;

import com.capgemaniac.ServiciosNegocio.Arquitectura.OutputServicioNegocio;
import com.capgemaniac.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaniac.ServiciosNegocio.TO.IN.InputBuscarArticulo;
import com.capgemaniac.util.Utilidades;

public class SNBuscarArticulo extends ServicioNegocio{

	@Override
	protected OutputServicioNegocio llamadaServicio() {
		Utilidades.escribirLogInfo("Inicio- SNBuscarArticulo", log);
		InputBuscarArticulo entrada = (InputBuscarArticulo) this.getEntradaServicio();

		return null;
	}

	@Override
	protected void setIdServicio(int idServicio) {
		this.idServicio=3;

	}

}
