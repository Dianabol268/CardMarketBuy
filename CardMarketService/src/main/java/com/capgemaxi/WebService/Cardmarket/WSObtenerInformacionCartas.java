package com.capgemaxi.WebService.Cardmarket;

import java.util.logging.Logger;

import com.capgemaxi.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaxi.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaxi.WebService.Cardmarket.Arquitectura.WebServiceProperties;
import com.capgemaxi.WebService.Cardmarket.pojo.Response;
import com.capgemaxi.WebService.Cardmarket.pojo.Response.Product;
import com.capgemaxi.util.Utilidades;

public class WSObtenerInformacionCartas {

	public static final Logger log = Logger.getLogger(WSObtenerInformacionCartas.class.getName());
	/**
	 * devuelve el precio Minimo de una carta, de la expansion indicada, el nombre de la carta viene en el idioma indicado
	 * diferencia entre foiol y no foil
	 * @param carta
	 * @param idioma
	 * @return
	 */

	public static Product obtenerCarta(String carta, int juego, int idioma, String expansion, boolean foil) {

		 WebServiceCall app = new WebServiceCall();
		 StringBuilder str = new StringBuilder();
		 str.append("https://www.mkmapi.eu/ws/v1.1/products/");
		 str.append(carta);
		 str.append("/");
		 str.append(juego);
		 str.append("/");
		 str.append(idioma);
		 str.append("/");
		 str.append("false");

		  if (app.requestCard(str.toString())) { //  game  lenguaje isexact
			  Response salidaWebService = new Response();
			  salidaWebService =  (Response) Utilidades.unMarshall(app.responseContent(), salidaWebService);

			  //por cada producto, buscamos la de la expansion que nos han pasado

			  for(Product producto: salidaWebService.getProduct()) {
				  if(!Utilidades.isNull(producto)) {
					  //si coincide la expansion...

					  if(expansion.toLowerCase().equals(producto.getExpansion().toLowerCase())) {
							  return producto;

					  }
				  }
			  }

          }

		return null;

	}

	/**
	 * devuelve el precio Minimo de una carta,por el ID. tambien diferencia entre foil y no foil
	 * @param carta
	 * @param idioma
	 * @return
	 */

	public static Product obtenerCarta(Integer id, boolean foil) {
		 WebServiceCall app = new WebServiceCall();
		 StringBuilder str = new StringBuilder();
		 str.append("https://www.mkmapi.eu/ws/v1.1/product/");
		 str.append(id);

		  if (app.requestCard(str.toString())) {
			  Response salidaWebService = new Response();
			  salidaWebService =  (Response) Utilidades.unMarshall(app.responseContent(), salidaWebService);

			  //solo deberia venir 1 producto ya uqe las ID son unicas
			  for(Product producto: salidaWebService.getProduct()) {
				  if(!Utilidades.isNull(producto)) {
						 return producto;

				  }
			  }

          }
		  return null;
	}

}
