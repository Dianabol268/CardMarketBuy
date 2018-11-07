package com.capgemaniac.ServiciosNegocio.TO.OUT;

import java.util.List;

import com.capgemaniac.ServiciosNegocio.Arquitectura.OutputServicioNegocio;
import com.capgemaniac.WebService.Cardmarket.pojo.Request.Article;

public class OutputActualizarPrecioColeccion extends OutputServicioNegocio{

	private List<Article> listaArticulos;
	private Integer articulosActualizadosTotales;
	
	public Integer getArticulosActualizadosTotales() {
		return articulosActualizadosTotales;
	}

	public void setArticulosActualizadosTotales(Integer articulosActualizadosTotales) {
		this.articulosActualizadosTotales = articulosActualizadosTotales;
	}

	public List<Article> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(List<Article> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

	
}
