package com.capgemaniac.WebService.Cardmarket;


import java.util.logging.Logger;

import com.capgemaniac.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaniac.WebService.Cardmarket.Arquitectura.WebServiceProperties;
import com.capgemaniac.WebService.Cardmarket.pojo.Response;
import com.capgemaniac.WebService.Cardmarket.pojo.Response.Product;
import com.capgemaniac.util.Utilidades;

public class WSObtenerInformacionCartas {

		/**
	 * devuelve el producto, de la expansion indicada, el nombre de la carta viene en el idioma indicado
	 * diferencia entre foiol y no foil
	 * @param carta
	 * @param idioma
		 * @param log
	 * @return
	 */

	public static Product obtenerCarta(String carta, int juego, int idioma, String expansion, Logger log) {

		 WebServiceCall app = new WebServiceCall(log);
		 StringBuilder str = new StringBuilder();
		 str.append(WebServiceProperties.URLCARDMARKET+ "products/find?search=");
		 str.append(carta);
		 str.append("&");
		 str.append("idGame=" + juego);
		 str.append("&idLanguage="+idioma);


		  if (app.requestMKMGet(str.toString())) { //  game  lenguaje isexact
			  Response salidaWebService = new Response();
			  salidaWebService =  (Response) Utilidades.unMarshall(app.responseContent(), salidaWebService, log);

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
	 * devuelve el producto,por el ID. 
	 * @param log
	 * @param carta
	 * @param idioma
	 * @return
	 */

	public static Product obtenerCarta(Integer id,  Logger log) {
		 WebServiceCall app = new WebServiceCall(log);
		 StringBuilder str = new StringBuilder();
		 str.append(WebServiceProperties.URLCARDMARKET+"product/");
		 str.append(id);

		  if (app.requestMKMGet(str.toString())) {
			  Response salidaWebService = new Response();
			  salidaWebService =  (Response) Utilidades.unMarshall(app.responseContent(), salidaWebService, log);

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
