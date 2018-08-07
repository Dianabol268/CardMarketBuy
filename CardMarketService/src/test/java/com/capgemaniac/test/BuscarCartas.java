package com.capgemaniac.test;


import org.junit.Test;

import com.capgemaniac.ServiciosNegocio.SNBuscarArticulo;
import com.capgemaniac.ServiciosNegocio.TO.IN.InputBuscarArticulo;

import com.capgemaniac.ServiciosNegocio.TO.OUT.OutputBuscarArticulo;
import com.capgemaniac.WebService.Cardmarket.pojo.Response.Product;

public class BuscarCartas {
	@Test
	  public void evaluatesExpression() {
		SNBuscarArticulo servicio = new SNBuscarArticulo();
		InputBuscarArticulo toIn = new InputBuscarArticulo();
		toIn.setNombreCarta("liliana");
		toIn.setIdioma(1);
		toIn.setJuego(1);
		OutputBuscarArticulo toOut = (OutputBuscarArticulo) servicio.llamadaServicio(toIn);
		for(Product producto : toOut.getListaProductos()) {
			System.out.println(producto.getEnName());
		}

	  }
}
