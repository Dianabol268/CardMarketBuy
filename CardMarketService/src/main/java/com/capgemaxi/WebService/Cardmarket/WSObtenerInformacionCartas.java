package com.capgemaxi.WebService.Cardmarket;

import com.capgemaxi.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaxi.WebService.Cardmarket.Arquitectura.WebServiceProperties;
import com.capgemaxi.WebService.Cardmarket.pojo.Response;
import com.capgemaxi.util.Utilidades;

public class WSObtenerInformacionCartas {

	/**
	 * devuelve el precio Minimo de una carta, si hay varias expansiones coge el mas bajo
	 * @param carta
	 * @param idioma
	 * @return
	 */

	public static float obtenerPrecioMinimoCarta(String carta, int juego, int idioma) {

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
			  return salidaWebService.getProduct().get(0).getPriceGuide().getLOW();
          }

		return 0.0F;

	}

}
