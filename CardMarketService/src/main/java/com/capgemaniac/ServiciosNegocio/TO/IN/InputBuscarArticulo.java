package com.capgemaniac.ServiciosNegocio.TO.IN;

import com.capgemaniac.ServiciosNegocio.Arquitectura.InputServicioNegocio;

public class InputBuscarArticulo extends InputServicioNegocio{

	private  String nombreCarta; //es una busqueda asi que podra ser un fragmento del nombre y slair muchos resultados
	private  Integer idioma;
	private Integer juego;


	public String getNombreCarta() {
		return nombreCarta;
	}

	public void setNombreCarta(String nombreCarta) {
		this.nombreCarta = nombreCarta;
	}

	public Integer getIdioma() {
		return idioma;
	}

	public void setIdioma(Integer idioma) {
		this.idioma = idioma;
	}

	public Integer getJuego() {
		return juego;
	}

	public void setJuego(Integer juego) {
		this.juego = juego;
	}


	@Override
	public void setDescriptor() {
		this.descriptor="Objeto que encapsula la Informacion de entrada al servicio de Negocio SNBuscarArticulo";

	}

}
