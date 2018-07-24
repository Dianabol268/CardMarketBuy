package com.capgemaxi.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

import com.capgemaxi.ServiciosNegocio.SNAgregarColeccionVender;
import com.capgemaxi.ServiciosNegocio.SNObtenerPrecioColeccion;
import com.capgemaxi.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaxi.ServiciosNegocio.TO.IN.InputAgregarColeccionVender;
import com.capgemaxi.ServiciosNegocio.TO.IN.InputObtenerPrecioColeccion;
import com.capgemaxi.ServiciosNegocio.TO.OUT.OutputObtenerPrecioColeccion;
import com.capgemaxi.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaxi.WebService.Cardmarket.pojo.Request.Article;
import com.capgemaxi.WebService.Cardmarket.pojo.Response;

public class ServicioNegocioTest {

	@Test
	  public void evaluatesExpression() {
		SNObtenerPrecioColeccion servicio = new SNObtenerPrecioColeccion();
		InputObtenerPrecioColeccion toIn = new InputObtenerPrecioColeccion();
		toIn.setIdioma(1);
		toIn.setIdJuego(1);
		List<Map<String, Object>> listadoCartas = new ArrayList<Map<String, Object>>();
		Map<String, Object> mapRaise = new HashMap<String, Object>();
		mapRaise.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_EXPANSION, "mirrodin");
		mapRaise.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_NOMBRE, "raise_the_alarm");
		mapRaise.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_FOIL, false);
		listadoCartas.add(mapRaise);

		Map<String, Object> mapCaster = new HashMap<String, Object>();
		mapCaster.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_EXPANSION, "innistrad");
		mapCaster.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_NOMBRE, "snapcaster_mage");
		mapCaster.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_FOIL, false);
		listadoCartas.add(mapCaster);

		Map<String, Object> mapCarta = new HashMap<String, Object>();
		mapCarta.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_ID, 12);
		mapCarta.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_FOIL, false);
		listadoCartas.add(mapCarta);

		toIn.setListadoCartas(listadoCartas);

//		OutputObtenerPrecioColeccion toOut =  (OutputObtenerPrecioColeccion) servicio.llamadaServicio(toIn);

//		WebServiceCall app = new WebServiceCall(null);
//		 StringBuilder str = new StringBuilder();
//		 str.append("https://www.mkmapi.eu/ws/v2.0/expansions/15/singles");
//
//
//		  if (app.requestMKM(str.toString())) { //  game  lenguaje isexact
//			  Response salidaWebService = new Response();
//			  System.out.println(app.responseContent());
//		  }
		WebServiceCall ws = new WebServiceCall(Logger.getLogger(ServicioNegocio.class.getName()));
		ws.requestMKMGet("https://www.mkmapi.eu/ws/v1.1/stock");


		Article carta = new Article();
		carta.setIdProduct(2);
		carta.setCondition("NM");
		carta.setIdLanguage(1);
		carta.setCount(1);
		carta.setPrice(25.5F);
		carta.setComments("Intrducido desde api");
		carta.setIsFoil(false);
		carta.setIsPlayset(false);
		carta.setIsSigned(false);
		List<Article> lista = new ArrayList<Article>();
		lista.add(carta);
		SNAgregarColeccionVender sn = new SNAgregarColeccionVender();
		InputAgregarColeccionVender toIn2 = new InputAgregarColeccionVender();
		toIn2.setListaCartas(lista);
		sn.llamadaServicio(toIn2);
	  }

}
