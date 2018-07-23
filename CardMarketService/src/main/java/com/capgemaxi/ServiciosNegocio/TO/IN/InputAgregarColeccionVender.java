package com.capgemaxi.ServiciosNegocio.TO.IN;

import java.util.List;

import com.capgemaxi.ServiciosNegocio.Arquitectura.InputServicioNegocio;
import com.capgemaxi.WebService.Cardmarket.pojo.Request;
import com.capgemaxi.WebService.Cardmarket.pojo.Request.Article;

public class InputAgregarColeccionVender extends InputServicioNegocio{

	private List<Article> listaCartas;
	public List<Article> getListaCartas() {
		return listaCartas;
	}
	public void setListaCartas(List<Article> listaCartas) {
		this.listaCartas = listaCartas;
	}
	@Override
	public void setDescriptor() {
		this.descriptor="Objeto que encapsula la Informacion de entrada al servicio de Negocio SNOAgregarColeccionVender";
	}

}
