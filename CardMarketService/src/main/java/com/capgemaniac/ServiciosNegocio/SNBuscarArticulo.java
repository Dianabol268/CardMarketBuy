package com.capgemaniac.ServiciosNegocio;

import com.capgemaniac.ServiciosNegocio.Arquitectura.OutputServicioNegocio;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import com.capgemaniac.ServiciosNegocio.Arquitectura.ServicioNegocio;
import com.capgemaniac.ServiciosNegocio.TO.IN.InputBuscarArticulo;
import com.capgemaniac.ServiciosNegocio.TO.OUT.OutputBuscarArticulo;
import com.capgemaniac.WebService.Cardmarket.WSObtenerInformacionCartas;
import com.capgemaniac.WebService.Cardmarket.pojo.Response.Product;
import com.capgemaniac.util.Utilidades;

public class SNBuscarArticulo extends ServicioNegocio{

	@Override
	protected OutputServicioNegocio llamadaServicio() {
		Utilidades.escribirLogInfo("Inicio- SNBuscarArticulo");
		InputBuscarArticulo entrada = (InputBuscarArticulo) this.getEntradaServicio();

		OutputBuscarArticulo salida = new OutputBuscarArticulo();
		salida.setListaProductos(WSObtenerInformacionCartas.buscarCarta(entrada.getNombreCarta(), entrada.getJuego(), entrada.getIdioma()));
		salida.setListaProductos(filtrarPorExpansion(salida, entrada.getExpansion())); 
		Utilidades.escribirLogInfo("Final- SNBuscarArticulo");
		return salida;
	}

	/**
	 * Metodo que filtrara por expansion, si no viene lo deja como esta
	 * @param salida
	 * @param entrada
	 */
	private List<Product> filtrarPorExpansion(OutputBuscarArticulo salida, String entrada) {	
		List<Product> listaSalida= new ArrayList<Product>();
		if(!StringUtils.isEmpty(entrada) && !StringUtils.isBlank(entrada)) {
			String comparar = entrada.toLowerCase().trim();
			//recorremos toda la salida--eliminamos todos los resultados que no coincidan con la expansion
			for(Product item:salida.getListaProductos()) {
				if(item.getExpansionName()!=null) {
					String compararItem = item.getExpansionName().toString().toLowerCase().trim();	
					compararItem = compararItem.replaceAll("\\s+","");
					if(compararItem.equals(comparar)) {
						listaSalida.add(item);
					
					}	

				}
			}
		}
		return listaSalida;
	}

	@Override
	protected void setIdServicio(int idServicio) {
		this.idServicio=3;

	}

}
