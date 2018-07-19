package com.capgemaxi.WebService.Cardmarket;

import java.util.logging.Logger;

import com.capgemaxi.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaxi.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaxi.WebService.Cardmarket.Arquitectura.WebServiceProperties;
import com.capgemaxi.WebService.Cardmarket.pojo.Response;
import com.capgemaxi.WebService.Cardmarket.pojo.Response.Product;
import com.capgemaxi.util.Utilidades;

public class WSObtenerInformacionCartas {
	
	
	/**
	 * devuelve el precio Minimo de una carta, si hay varias expansiones coge el mas bajo
	 * @param carta
	 * @param idioma
	 * @return
	 */

	public static Float obtenerPrecioMinimoCarta(String carta, int juego, int idioma, String expansion, boolean foil) {

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
						  if(foil) {
							  return producto.getPriceGuide().getLOWFOIL();
						  }
						  else {
							  return producto.getPriceGuide().getLOW(); 
							   
						  }
					  }
				  }
			  }
	 
          }

		return null;

	}

}
