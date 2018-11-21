package com.capgemaniac.WebService.Cardmarket;

import java.util.logging.Logger;

import com.capgemaniac.WebService.Cardmarket.Arquitectura.WebServiceCall;
import com.capgemaniac.WebService.Cardmarket.Arquitectura.WebServiceProperties;
import com.capgemaniac.WebService.Cardmarket.pojo.Request;
import com.capgemaniac.WebService.Cardmarket.pojo.Request.Article;
import com.capgemaniac.util.Constants;


public class WSAgregarArticulosCuenta {

	public void ponerArticulosVenta(Article carta) {

		Request request = new Request();
		request.setArticle(carta);

		 WebServiceCall app = new WebServiceCall();
		 StringBuilder str = new StringBuilder();
		 str.append(Constants.URLCARDMARKET+ "stock");
		  if (app.requestMKMPost(str.toString(), request)) {

		  }
	}

}
