package com.capgemaxi.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
		List<String> listadoCartas = new ArrayList<String>();
		listadoCartas.add("raise_the_alarm");
		listadoCartas.add("snapcaster_mage");
		toIn.setListadoNombresCartas(listadoCartas);

		OutputObtenerPrecioColeccion toOut =  (OutputObtenerPrecioColeccion) servicio.llamadaServicio(toIn);
		Assert.assertEquals(toOut.getPrecioColeccion(), null);
	  }

}
