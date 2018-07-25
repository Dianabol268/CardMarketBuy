package com.capgemaniac.test;

import java.util.logging.Logger;

import org.junit.Test;

import com.capgemaniac.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaniac.WebService.Cardmarket.Arquitectura.WebServiceCall;

public class GetStockTest {
	@Test
	  public void evaluatesExpression() {
	WebServiceCall ws = new WebServiceCall(Logger.getLogger(ServicioNegocio.class.getName()));
	ws.requestMKMGet("https://api.cardmarket.com/ws/v2.0/stock");

	ws.requestMKMGet("https://api.cardmarket.com/ws/v2.0/products/2");

	}
}
