package com.capgemaniac.ServiciosNegocio.TO.OUT;

import java.util.List;

import com.capgemaniac.ServiciosNegocio.Arquitectura.OutputServicioNegocio;
import com.capgemaniac.WebService.Cardmarket.pojo.Response.Product;

public class OutputBuscarArticulo extends OutputServicioNegocio{

	private List<Product> listaProductos;

	public List<Product> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Product> listaProductos) {
		this.listaProductos = listaProductos;
	}
}
