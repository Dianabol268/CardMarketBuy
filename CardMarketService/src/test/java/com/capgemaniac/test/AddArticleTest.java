package com.capgemaniac.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.capgemaniac.ServiciosNegocio.SNAgregarColeccionVender;
import com.capgemaniac.ServiciosNegocio.TO.IN.InputAgregarColeccionVender;
import com.capgemaniac.WebService.Cardmarket.pojo.Request.Article;

public class AddArticleTest {


	@Test
	  public void evaluatesExpression() {
	Article carta = new Article();
	carta.setIdProduct(2);
	carta.setCondition("NM");
	carta.setIdLanguage(1);
	carta.setCount(1);
	carta.setPrice(255.5F);
	carta.setComments("Intrducido desde api");
	carta.setIsFoil(false);
	carta.setIsPlayset(false);
	carta.setIsSigned(false);
	List<Article> lista = new ArrayList<Article>();
	lista.add(carta);
	SNAgregarColeccionVender sn = new SNAgregarColeccionVender();
	InputAgregarColeccionVender toIn2 = new InputAgregarColeccionVender();
	toIn2.setListaCartas(lista);
	sn.llamadaServicio(toIn2);
}
}
