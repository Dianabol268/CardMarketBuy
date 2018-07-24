package com.capgemaxi.WebService.Cardmarket;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Logger;

import com.capgemaxi.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaxi.WebService.Cardmarket.pojo.Request;
import com.capgemaxi.WebService.Cardmarket.pojo.Request.Article;
import com.capgemaxi.util.Utilidades;

public class WSAgregarArticulosCuenta {

	public void ponerArticulosVenta(Article carta, Logger log) {

		Request request = new Request();
		request.setArticle(carta);

		 WebServiceCall app = new WebServiceCall(log);
		 StringBuilder str = new StringBuilder();
		 str.append("https://www.mkmapi.eu/ws/v1.1/stock");

		  if (app.requestMKMPost(str.toString(), request)) {

		  }
	}

}
