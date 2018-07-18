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



	/**
	 *Metodo que te rellena un Objeto
	 * @param <JAXBContext>
	 */

	public static <JAXBContext> Object unMarshall(StringBuffer stringBuffer, Object objeto) {
		if(stringBuffer != null && objeto!=null){

		}
//		JAXBContext jaxbContext = JAXBContext.newInstance(objeto.getClass());
//		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//		Customer customer = (Customer) jaxbUnmarshaller.unmarshal(new File("C:\\file.xml"));
		return objeto;
	}
}
