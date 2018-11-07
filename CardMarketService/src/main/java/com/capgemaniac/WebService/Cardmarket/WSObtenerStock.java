package com.capgemaniac.WebService.Cardmarket;

import java.util.ArrayList;
import java.util.List;

import com.capgemaniac.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaniac.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaniac.WebService.Cardmarket.pojo.Response;
import com.capgemaniac.WebService.Cardmarket.pojo.Request.Article;
import com.capgemaniac.util.Constants;
import com.capgemaniac.util.Utilidades;

public class WSObtenerStock {

	public static List<Article> getStock(){
		
		 WebServiceCall app = new WebServiceCall(ServicioNegocio.log);
		 StringBuilder str = new StringBuilder();
		 str.append(Constants.URLCARDMARKET+ "stock");
		 Response salidaWebService = new Response();
		 List<Article> listaArticulos = new ArrayList<Article>();
		  if (app.requestMKMGet(str.toString())) { 
			  salidaWebService =  (Response) Utilidades.unMarshall(app.responseContent(), salidaWebService, ServicioNegocio.log);
			  listaArticulos= salidaWebService.getArticle();
		  }
		  	
		return listaArticulos;
	}
}
