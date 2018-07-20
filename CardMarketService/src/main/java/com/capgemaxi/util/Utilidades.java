package com.capgemaxi.util;

import java.io.StringReader;
import java.math.BigDecimal;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.util.logging.Level;
import java.util.logging.Logger;



public final class Utilidades {
	public static final Logger log = Logger.getLogger(Utilidades.class.getName());

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
