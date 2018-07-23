package com.capgemaxi.WebService.Cardmarket;

import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Logger;

import com.capgemaxi.WebService.Cardmarket.pojo.Request;
import com.capgemaxi.WebService.Cardmarket.pojo.Request.Article;
import com.capgemaxi.util.Utilidades;

public class WSAgregarArticulosCuenta {

	public void ponerArticulosVenta(Article carta, Logger log) {

		Request request = new Request();
		request.setArticle(carta);
		ObjectOutputStream oos = Utilidades.marshall(request, log);
		System.out.println(oos.toString());
	}

}
