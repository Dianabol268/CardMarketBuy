package com.capgemaniac.ServiciosNegocio;

import java.util.List;

import com.capgemaniac.ServiciosNegocio.Arquitectura.OutputServicioNegocio;
import com.capgemaniac.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaniac.WebService.Cardmarket.WSObtenerStock;
import com.capgemaniac.WebService.Cardmarket.pojo.Request.Article;

/**
 *  Servicio que actualiza el precio el stock conforme a los nuevos precios.
 *  este metodo no tiene objeto de entrada, ya que debe realziar una consulta
 */
public class SNActualizarPrecioColeccion extends ServicioNegocio{
	
	@Override
	protected OutputServicioNegocio llamadaServicio() {
		// Primero de Todo Obtenemos toda la coleccion
		List<Article> consultaStock= WSObtenerStock.getStock();
		
		return null;
	}



	@Override
	protected void setIdServicio(int idServicio) {
		this.idServicio=4;
		
	}

}
