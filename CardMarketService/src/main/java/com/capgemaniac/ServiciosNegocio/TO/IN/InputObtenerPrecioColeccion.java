package com.capgemaniac.ServiciosNegocio.TO.IN;

import java.util.List;
import java.util.Map;

import com.capgemaniac.ServiciosNegocio.Arquitectura.InputServicioNegocio;

public class InputObtenerPrecioColeccion extends InputServicioNegocio{

	public static final String LISTADO_CARTAS_ID= "ID";
	public static final String LISTADO_CARTAS_NOMBRE= "NOMBRECARTA";
	public static final String LISTADO_CARTAS_EXPANSION= "EXPANSION";
	public static final String LISTADO_CARTAS_FOIL= "FOIL";

	private List<Map<String, Object>> listadoCartas;
	private int idJuego;
	private int idioma;


	@Override
	public void setDescriptor() {
		this.descriptor="Objeto que encapsula la Informacion de entrada al servicio de Negocio SNObtenerPrecioColeccion";
	}

	public List<Map<String, Object>> getListadoCartas() {
		return listadoCartas;
	}

	public void setListadoCartas(List<Map<String, Object>> listadoNombresCartas) {
		this.listadoCartas = listadoNombresCartas;
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
