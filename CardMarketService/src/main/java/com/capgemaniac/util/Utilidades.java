package com.capgemaniac.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.capgemaniac.ServiciosNegocio.Arquitectura.ServicioNegocio;

import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;



public final class Utilidades {

	 public static String join(Collection<?> s, String delimiter) {
	        StringBuilder builder = new StringBuilder();
	        Iterator<?> iter = s.iterator();
	        while (iter.hasNext()) {
	            builder.append(iter.next());
	            if (!iter.hasNext()) {
	              break;                  
	            }
	            builder.append(delimiter);
	        }
	        return builder.toString();
	    }

	/**
	 *
	 * metodo que escribira en el log dependiendo de si estan activados o no TODO el si estan activados o no
	 */
	public static void escribirLogInfo(String info, Logger log) {
		if (log!=null){
			log.info(info);
		}

	}


	/**
	 * metodo que devuelve true si el numero que nos pasan es nulo o 0
	 * @param precio
	 * @return
	 */
	public static boolean isZero(Number precio) {
		if(precio!=null && precio.floatValue()!=0.0F) {
			return false;
		}
		return true;
	}

	/**
	 * Metodo que comprueba si un objeto es nulo
	 * @param objeto
	 * @return
	 */
	public static boolean isNull(Object objeto) {
		if(objeto!=null) {
			return false;
		}
		return true;
	}
	
	/**
	 *  Metodo que realiza la conversion de un objeto Java a un String 
	 */
	public static String marshall(Object objeto, Logger log) {
		
		  JAXBContext jaxbContext;		  
		try {
			jaxbContext = JAXBContext.newInstance(objeto.getClass());
			java.io.StringWriter sw = new StringWriter();
	          Marshaller marshaller = jaxbContext.createMarshaller();
	          marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
	          marshaller.marshal(objeto, sw);
	         return sw.toString();
		} 
              
         catch (JAXBException error) {
        	 log.log(Level.SEVERE, "Error haciendo el marshall a xml: Detalles del error: "+ error.getMessage() +
						"////Causa: " + error.getCause());
 		}
		return null;
	}
	
	/**
	 *Metodo que te rellena un Objeto con un xml de entrada
	 * @param <JAXBContext>
	 */

	public static Object unMarshall(StringBuffer stringBuffer, Object objeto, Logger log) {
		if(stringBuffer != null && objeto!=null){
			   try {
				   JAXBContext jaxbContext = JAXBContext.newInstance(objeto.getClass());
				   Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				   objeto = (Object) jaxbUnmarshaller.unmarshal(new StringReader(stringBuffer.toString()));
				   //no deberia darse
			} catch (JAXBException error) {
				log.log(Level.SEVERE, "Error haciendo el Unmarshall del xml: Detalles del error: "+ error.getMessage() +
						"////Causa: " + error.getCause());
			}
		}
		return objeto;
	}

	

	  /**
	  * Converts a Double to BigDecimal in the most efficient and accurate manner
	  * BigDecimal is the preferred format for .Net
	  * @param number
	  * @return
	  */
	  public static BigDecimal getBigDecimalFromFloat(Float number)
	  {
	    String strNumber = number.toString();
	    BigDecimal bdReturn = new BigDecimal(strNumber);
	    return bdReturn;
	  }

	/**
     * Round to certain number of decimals
     *
     * @param d
     * @param decimalPlace
     * @return
     */
    public static Float round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

}
