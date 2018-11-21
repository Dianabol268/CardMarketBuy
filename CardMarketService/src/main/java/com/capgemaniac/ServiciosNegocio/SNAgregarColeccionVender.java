package com.capgemaniac.ServiciosNegocio;

import java.util.ArrayList;
import java.util.List;

import com.capgemaniac.ServiciosNegocio.Arquitectura.OutputServicioNegocio;
import com.capgemaniac.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaniac.ServiciosNegocio.TO.IN.InputAgregarColeccionVender;
import com.capgemaniac.WebService.Cardmarket.WSAgregarArticulosCuenta;
import com.capgemaniac.WebService.Cardmarket.pojo.Request.Article;
import com.capgemaniac.util.Utilidades;

public class SNAgregarColeccionVender extends ServicioNegocio{


	@Override
	protected OutputServicioNegocio llamadaServicio() {
		Utilidades.escribirLogInfo("Inicio- SNAgregarCartaVender");
		InputAgregarColeccionVender entrada = (InputAgregarColeccionVender) this.getEntradaServicio();
		//creamos las listas que tendremos que devolver
		List<Article> cartasAgregadas = new ArrayList<Article>();
		List<Article> cartasNoAgregadas = new ArrayList<Article>();

		WSAgregarArticulosCuenta llamadaWS = new WSAgregarArticulosCuenta();
		//recorremos las cartas de entrada
		for(Article cartaAInsertar:entrada.getListaCartas()) {
			//primero quitamos las que no pasen la validacion
			if(!validarInfo(cartaAInsertar)) {
				Utilidades.escribirLogInfo("carta No agregada-no ha superado la validación: " + cartaAInsertar.getIdProduct());
				cartasNoAgregadas.add(cartaAInsertar);
			}
			else {
				llamadaWS.ponerArticulosVenta(cartaAInsertar);
				cartasAgregadas.add(cartaAInsertar);
			}
		}


		Utilidades.escribirLogInfo("Final- SNAgregarCartaVender");
		return null;
	}


//	<?xml version="1.0" encoding="UTF-8" ?>
//	<request>
//	    <article>
//	        <idProduct />           // Product ID the article is derived from (for POST) OR
//	        <idArticle />           // Article ID (for PUT and DELETE)
//	        <count />               // Quantity (for POST), quantity of updated, resp. deleted articles (for PUT and DELETE)
//	        <idLanguage />          // Language of the article
//	        <comments />            // User comments
//	        <price />               // Price the article is offered for
//	        <condition />           // Condition, if applicable (optional)
//	        <isFoil />
//	        <isSigned />
//	        <isAltered />
//	        <isPlayset />
//	        <isFirstEd />
//	    </article>
//	</request>

	private boolean validarInfo(Article cartaAInsertar) {
		//TODO
		return true;
	}



	@Override
	protected void setIdServicio(int idServicio) {
		this.idServicio=2;

	}

}
