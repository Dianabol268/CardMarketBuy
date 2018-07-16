package com.capgemaxi.ServicioNegocio.TO;

import java.util.List;

import com.capgemaxi.ServiciosNegocio.Arquitectura.InputServicioNegocio;

public class InputObtenerPrecioColeccion extends InputServicioNegocio{



	private List<String> listadoNombresCartas;
	private int idJuego;
	private int idioma;
	
	@Override
	public void setDescriptor() {
		this.descriptor="Objeto que encapsula la Informacion de entrada al servicio de Negocio SNObtenerPrecioColeccion";		
	}
	
	public List<String> getListadoNombresCartas() {
		return listadoNombresCartas;
	}

	public void setListadoNombresCartas(List<String> listadoNombresCartas) {
		this.listadoNombresCartas = listadoNombresCartas;
	}

	public int getIdJuego() {
		return idJuego;
	}

	public void setIdJuego(int idJuego) {
		this.idJuego = idJuego;
	}

	public int getIdioma() {
		return idioma;
	}

	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}
}
