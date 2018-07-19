package com.capgemaxi.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;


import com.capgemaxi.ServiciosNegocio.SNObtenerPrecioColeccion;
import com.capgemaxi.ServiciosNegocio.TO.IN.InputObtenerPrecioColeccion;
import com.capgemaxi.ServiciosNegocio.TO.OUT.OutputObtenerPrecioColeccion;

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

		toIn.setListadoCartas(listadoCartas);

		OutputObtenerPrecioColeccion toOut =  (OutputObtenerPrecioColeccion) servicio.llamadaServicio(toIn);
		Assert.assertEquals(toOut.getPrecioColeccion(), null);
	  }

}
