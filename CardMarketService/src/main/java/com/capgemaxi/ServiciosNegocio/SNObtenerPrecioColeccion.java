package com.capgemaxi.ServiciosNegocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemaxi.ServiciosNegocio.Arquitectura.OutputServicioNegocio;
import com.capgemaxi.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaxi.ServiciosNegocio.TO.IN.InputObtenerPrecioColeccion;
import com.capgemaxi.ServiciosNegocio.TO.OUT.OutputObtenerPrecioColeccion;
import com.capgemaxi.WebService.Cardmarket.WSObtenerInformacionCartas;
import com.capgemaxi.util.Utilidades;


/**
 * Servicio que pasandole como parametro una List<Strings> que seran nombres de cartas
 * para todas las cartas que encuentre  en la llamada al webservice calculara su precio
 * @return listadoConPrecio
 * @author Saul Blanco
 *
 */
public class SNObtenerPrecioColeccion extends ServicioNegocio{

	@Override
	public OutputServicioNegocio llamadaServicio() {

		log.info("Inicio- SNObtenerPrecioColeccion");
		//primero inicializamos el objeto de entrada de arquitectura, con el cast Necesario
		InputObtenerPrecioColeccion entrada = (InputObtenerPrecioColeccion) this.getEntradaServicio();
		int juego= entrada.getIdJuego();
		int idioma= entrada.getIdioma();

		//creamos las listas que tendremos que devolver
		List<String> cartaEncontradas = new ArrayList<String>();
		List<String> cartaNoEncontradas = new ArrayList<String>();
		Double precioAcumulado= new Double(0);

		for(Map<String, Object> carta :entrada.getListadoCartas()) {
			
			String expansion=(String) carta.get(InputObtenerPrecioColeccion.LISTADO_CARTAS_EXPANSION);
			String nombre =  (String) carta.get(InputObtenerPrecioColeccion.LISTADO_CARTAS_NOMBRE);
			boolean foil = (boolean) carta.get(InputObtenerPrecioColeccion.LISTADO_CARTAS_FOIL);
			Float precio = WSObtenerInformacionCartas.obtenerPrecioMinimoCarta(nombre, juego, idioma, expansion, foil);
			//si el servicio nos devuelve precio 0 es que no ha encontrado la carta
			if(!Utilidades.isZero(precio)) {
				cartaEncontradas.add(nombre);
				precioAcumulado = Double.sum(precioAcumulado, precio);
				log.info("In- SNObtenerPrecioColeccion- Precio carta: "+ nombre + " - " + precio + " euros");
			}
			else {
				cartaNoEncontradas.add(nombre);
			}
		}
		log.info("In- SNObtenerPrecioColeccion- PrecioTotal  " + precioAcumulado + " euros");

		OutputObtenerPrecioColeccion salida= new OutputObtenerPrecioColeccion();
		salida.setListadoCartasEncontradas(cartaEncontradas);
		salida.setListadoCartasNoEncontradas(cartaNoEncontradas);
		salida.setPrecioColeccion(precioAcumulado);

		log.info("Inicio- SNObtenerPrecioColeccion");
		return salida;

	}

	@Override
	protected void setIdServicio(int IdServicio) {
		this.setIdServicio(1);
	}

}
