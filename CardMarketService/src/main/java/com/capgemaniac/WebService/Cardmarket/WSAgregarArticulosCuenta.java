package com.capgemaniac.WebService.Cardmarket;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Logger;

import com.capgemaniac.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaniac.WebService.Cardmarket.Arquitectura.WebServiceProperties;
import com.capgemaniac.WebService.Cardmarket.pojo.Request;
import com.capgemaniac.WebService.Cardmarket.pojo.Request.Article;
import com.capgemaniac.util.Utilidades;

public class WSAgregarArticulosCuenta {

	public void ponerArticulosVenta(Article carta, Logger log) {

		Request request = new Request();
		request.setArticle(carta);

		 WebServiceCall app = new WebServiceCall(log);
		 StringBuilder str = new StringBuilder();
		 str.append(WebServiceProperties.URLCARDMARKET+ "stock");
		  if (app.requestMKMPost(str.toString(), request)) {

		  }
	}

}
