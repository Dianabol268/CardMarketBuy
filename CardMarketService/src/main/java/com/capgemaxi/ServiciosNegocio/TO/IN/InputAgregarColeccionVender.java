package com.capgemaxi.ServiciosNegocio.TO.IN;

import java.util.List;

import com.capgemaxi.ServiciosNegocio.Arquitectura.InputServicioNegocio;
import com.capgemaxi.WebService.Cardmarket.pojo.Request;

public class InputAgregarColeccionVender extends InputServicioNegocio{

	private List<Request> listaCartas;
	public List<Request> getListaCartas() {
		return listaCartas;
	}
	public void setListaCartas(List<Request> listaCartas) {
		this.listaCartas = listaCartas;
	}
	@Override
	public void setDescriptor() {
		this.descriptor="Objeto que encapsula la Informacion de entrada al servicio de Negocio SNOAgregarColeccionVender";
	}

}
