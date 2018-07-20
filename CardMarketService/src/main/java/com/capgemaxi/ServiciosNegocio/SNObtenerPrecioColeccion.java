package com.capgemaxi.ServiciosNegocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemaxi.ServiciosNegocio.Arquitectura.OutputServicioNegocio;
import com.capgemaxi.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaxi.ServiciosNegocio.TO.IN.InputObtenerPrecioColeccion;
import com.capgemaxi.ServiciosNegocio.TO.OUT.OutputObtenerPrecioColeccion;
import com.capgemaxi.WebService.Cardmarket.WSObtenerInformacionCartas;
import com.capgemaxi.WebService.Cardmarket.pojo.Response.Product;
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
	/**
	 * Servicio retorna el precio Mínimo de una colecion, cada carta puede venir indicada por su ID, que sera
	 * lo primero que se usara, en caso contrario se buscara su nombre y expansion dentro del TO de entrada.
	 *
	 */
	public OutputServicioNegocio llamadaServicio() {

		log.info("Inicio- SNObtenerPrecioColeccion");
		//primero inicializamos el objeto de entrada de arquitectura, con el cast Necesario
		InputObtenerPrecioColeccion entrada = (InputObtenerPrecioColeccion) this.getEntradaServicio();
		int juego= entrada.getIdJuego();
		int idioma= entrada.getIdioma();

		//creamos las listas que tendremos que devolver
		List<Product> cartaEncontradas = new ArrayList<Product>();
		List<String> cartaNoEncontradas = new ArrayList<String>();
		BigDecimal precioAcumulado= BigDecimal.ZERO;

		//recorremos las cartas de entrada
		for(Map<String, Object> carta :entrada.getListadoCartas()) {
			Integer id = (Integer) carta.get(InputObtenerPrecioColeccion.LISTADO_CARTAS_ID);
			String expansion=(String) carta.get(InputObtenerPrecioColeccion.LISTADO_CARTAS_EXPANSION);
			String nombre =  (String) carta.get(InputObtenerPrecioColeccion.LISTADO_CARTAS_NOMBRE);
			boolean foil = (boolean) carta.get(InputObtenerPrecioColeccion.LISTADO_CARTAS_FOIL);

			Product producto=null;
			//si trae Id buscamos por el, en caso contrario por nombre
			if(!Utilidades.isNull(id)) {
				producto = WSObtenerInformacionCartas.obtenerCarta(id, foil);
			}
			else if(!Utilidades.isNull(nombre)){
				producto = WSObtenerInformacionCartas.obtenerCarta(nombre, juego, idioma, expansion, foil);
			}

			BigDecimal precio=obtenerPrecioMinimoProducto(producto, foil);
			//si el servicio nos devuelve precio 0 es que no ha encontrado la carta
			if(!Utilidades.isZero(precio)) {
				cartaEncontradas.add(producto);
				precioAcumulado = precioAcumulado.add(precio);
			}
			else {
				cartaNoEncontradas.add(nombre);
			}
		}

		log.info("In- SNObtenerPrecioColeccion- PrecioTotal  " + precioAcumulado + " euros");

		OutputObtenerPrecioColeccion salida= new OutputObtenerPrecioColeccion();
		salida.setListadoCartasEncontradas(cartaEncontradas);
		//solo aplica para cuando busquemos por nombre
		salida.setListadoCartasNoEncontradas(cartaNoEncontradas);
		salida.setPrecioColeccion(precioAcumulado);
		log.info("Final- SNObtenerPrecioColeccion");
		return salida;

	}
	/**
	 * Metodo que te devuelve el precio minimo de un producto diferenciando si es foil o no
	 * en caso de nulo devolvera 0
	 * @param producto
	 * @param esFoil
	 * @return
	 */

	private BigDecimal obtenerPrecioMinimoProducto(Product producto, boolean esFoil) {
		if(!Utilidades.isNull(producto)) {
			if(esFoil) {
				  log.info("In- SNObtenerPrecioColeccion- Precio FOIL carta: "+ producto.getName().get(0).getProductName() + " - "
						  + producto.getPriceGuide().getLOWFOIL() + " euros");
				  return Utilidades.getBigDecimalFromFloat(producto.getPriceGuide().getLOWFOIL());
			  }
			  else {
				  log.info("In- SNObtenerPrecioColeccion- Precio carta: "+ producto.getName().get(0).getProductName() + " - "
						  + producto.getPriceGuide().getLOW() + " euros");
				  return Utilidades.getBigDecimalFromFloat(producto.getPriceGuide().getLOW());
			  }
		}
		return BigDecimal.ZERO;

	}


	@Override
	protected void setIdServicio(int IdServicio) {
		this.setIdServicio(1);
	}

}
