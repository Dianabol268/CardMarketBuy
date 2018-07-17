package com.capgemaxi.util;

public final class Utilidades {

	/**
	 * metodo que devuelve true si el Double que nos pasan es nulo o 0
	 * @param precio
	 * @return
	 */
	public static boolean isZero(Double precio) {
		if(precio!=null && precio!=0) {
			return true;
		}
		return false;
	}

}
