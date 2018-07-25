package com.capgemaniac.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

import com.capgemaniac.ServiciosNegocio.SNAgregarColeccionVender;
import com.capgemaniac.ServiciosNegocio.SNObtenerPrecioColeccion;
import com.capgemaniac.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaniac.ServiciosNegocio.TO.IN.InputAgregarColeccionVender;
import com.capgemaniac.ServiciosNegocio.TO.IN.InputObtenerPrecioColeccion;
import com.capgemaniac.ServiciosNegocio.TO.OUT.OutputObtenerPrecioColeccion;
import com.capgemaniac.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaniac.WebService.Cardmarket.pojo.Response;
import com.capgemaniac.WebService.Cardmarket.pojo.Request.Article;

public class ObtenerInfoCartasTest {

	@Test
	  public void evaluatesExpression() {
		SNObtenerPrecioColeccion servicio = new SNObtenerPrecioColeccion();
		InputObtenerPrecioColeccion toIn = new InputObtenerPrecioColeccion();
		toIn.setIdioma(1);
		toIn.setIdJuego(1);
		List<Map<String, Object>> listadoCartas = new ArrayList<Map<String, Object>>();
//		Map<String, Object> mapRaise = new HashMap<String, Object>();
//		mapRaise.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_EXPANSION, "mirrodin");
//		mapRaise.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_NOMBRE, "raise");
//		mapRaise.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_FOIL, false);
//		listadoCartas.add(mapRaise);

		Map<String, Object> mapCaster = new HashMap<String, Object>();
		mapCaster.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_EXPANSION, "innistrad");
		mapCaster.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_NOMBRE, "snapcaster");
		mapCaster.put(InputObtenerPrecioColeccion.LISTADO_CARTAS_FOIL, false);
		listadoCartas.add(mapCaster);


		toIn.setListadoCartas(listadoCartas);
		servicio.llamadaServicio(toIn);

	  }

}
