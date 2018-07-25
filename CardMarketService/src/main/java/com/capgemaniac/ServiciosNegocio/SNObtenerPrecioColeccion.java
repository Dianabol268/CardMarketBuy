package com.capgemaniac.ServiciosNegocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemaniac.ServiciosNegocio.Arquitectura.OutputServicioNegocio;
import com.capgemaniac.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaniac.ServiciosNegocio.TO.IN.InputObtenerPrecioColeccion;
import com.capgemaniac.ServiciosNegocio.TO.OUT.OutputObtenerPrecioColeccion;
import com.capgemaniac.WebService.Cardmarket.WSObtenerInformacionCartas;
import com.capgemaniac.WebService.Cardmarket.pojo.Response.Product;
import com.capgemaniac.util.Utilidades;


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

		Utilidades.escribirLogInfo("Inicio- SNObtenerPrecioColeccion", log);
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
				producto = WSObtenerInformacionCartas.obtenerCarta(id, log);
			}
			else if(!Utilidades.isNull(nombre)){
				producto = WSObtenerInformacionCartas.obtenerCarta(nombre, juego, idioma, expansion, log);
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

		Utilidades.escribirLogInfo("In- SNObtenerPrecioColeccion- PrecioTotal  " + precioAcumulado + " euros", log);

		OutputObtenerPrecioColeccion salida= new OutputObtenerPrecioColeccion();
		salida.setListadoCartasEncontradas(cartaEncontradas);
		//solo aplica para cuando busquemos por nombre
		salida.setListadoCartasNoEncontradas(cartaNoEncontradas);
		salida.setPrecioColeccion(precioAcumulado);
		Utilidades.escribirLogInfo("Final- SNObtenerPrecioColeccion", log);
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
				Utilidades.escribirLogInfo("In- SNObtenerPrecioColeccion- Precio FOIL carta: "+ producto.getEnName() + " - "
						  + producto.getPriceGuide().getLOWFOIL() + " euros", log);
				  return Utilidades.getBigDecimalFromFloat(producto.getPriceGuide().getLOWFOIL());
			  }
			  else {
				  Utilidades.escribirLogInfo("In- SNObtenerPrecioColeccion- Precio carta: "+ producto.getEnName() + " - "
						  + producto.getPriceGuide().getLOW() + " euros", log);
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
