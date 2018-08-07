package com.capgemaniac.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


import com.capgemaniac.ServiciosNegocio.SNObtenerPrecioColeccion;

import com.capgemaniac.ServiciosNegocio.TO.IN.InputObtenerPrecioColeccion;


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
