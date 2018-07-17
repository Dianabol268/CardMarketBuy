package com.capgemaxi.ServiciosNegocio.TO.OUT;

import java.util.List;

import com.capgemaxi.ServiciosNegocio.Arquitectura.OutputServicioNegocio;

public class OutputObtenerPrecioColeccion extends OutputServicioNegocio{



	private Number precioColeccion;

	private List<String> listadoCartasEncontradas;

	private List<String> listadoCartasNoEncontradas;

	public Number getPrecioColeccion() {
		return precioColeccion;
	}

	public void setPrecioColeccion(Number precioColeccion) {
		this.precioColeccion = precioColeccion;
	}

	public List<String> getListadoCartasEncontradas() {
		return listadoCartasEncontradas;
	}

	public void setListadoCartasEncontradas(List<String> listadoCartasEncontradas) {
		this.listadoCartasEncontradas = listadoCartasEncontradas;
	}

	public List<String> getListadoCartasNoEncontradas() {
		return listadoCartasNoEncontradas;
	}

	public void setListadoCartasNoEncontradas(List<String> listadoCartasNoEncontradas) {
		this.listadoCartasNoEncontradas = listadoCartasNoEncontradas;
	}
}
