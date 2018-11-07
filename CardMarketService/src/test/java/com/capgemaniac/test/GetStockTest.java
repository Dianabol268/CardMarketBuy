package com.capgemaniac.test;

import java.util.logging.Logger;

import org.junit.Test;

import com.capgemaniac.ServiciosNegocio.SNActualizarPrecioColeccion;
import com.capgemaniac.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaniac.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaniac.WebService.Cardmarket.pojo.Response.Product;

public class GetStockTest {
	@Test
	  public void evaluatesExpression() {
		SNActualizarPrecioColeccion a = new SNActualizarPrecioColeccion();
		a.llamadaServicio(null);
	}
}
