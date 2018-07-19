package com.capgemaxi.util;

import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;


import com.sun.media.jfxmedia.logging.Logger;

public final class Utilidades {

	/**
	 * metodo que devuelve true si el Double que nos pasan es nulo o 0
	 * @param precio
	 * @return
	 */
	public static boolean isZero(Number precio) {
		if(precio!=null && precio.floatValue()!=0) {
			return true;
		}
		return false;
	}



	/**
	 *Metodo que te rellena un Objeto
	 * @param <JAXBContext>
	 */

	public static Object unMarshall(StringBuffer stringBuffer, Object objeto) {
		if(stringBuffer != null && objeto!=null){
			   try {
				   JAXBContext jaxbContext = JAXBContext.newInstance(objeto.getClass());
				   Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				   objeto = (Object) jaxbUnmarshaller.unmarshal(new StringReader(stringBuffer.toString()));
				   //no deberia darse
			} catch (JAXBException e) {
				System.out.println("ERROR");
			}
		}
		return objeto;
	}



}
