package com.capgemaniac.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Propiedades {
	public static final String mkmAppToken = "mkmAppToken" ;
	public static final String mkmAppSecret = "mkmAppSecret" ;
	public static final String mkmAccessToken = "mkmAccessToken" ;
	public static final String mkmAccessTokenSecret = "mkmAccessTokenSecret" ;
	//vieja https://www.mkmapi.eu/ws/v2.0/
	public static final String URLCARDMARKET = "URLCARDMARKET";	
	public static final String ID_JUEGO_MAGIC = "ID_JUEGO_MAGIC";
	public static final String ID_IDIOMA_INGLES = "ID_IDIOMA_INGLES";
	
	private Properties properties = null;
	private static Propiedades instance = null;
	
	/** Creates the instance is synchronized to avoid multithreads problems */
	private synchronized static void createInstance () {
	    if (instance == null) { 
	        instance = new Propiedades ();
	    }
	}

	/** Get the properties instance. Uses singleton pattern */
	public static Propiedades getInstance(){
	    // Uses singleton pattern to guarantee the creation of only one instance
	    if(instance == null) {
	        createInstance();
	    }
	    return instance;
	}
	
	public Propiedades() {
		this.properties = new Properties();
		    try{
		    	InputStream input = null;
		    	//este desde raiz
		    	input = new FileInputStream("config.properties");
		    	//este seria desde resources
		    	//input = Propiedades.class.getClassLoader().getResourceAsStream(Constants.PATH_CONFFILE);		    	
		    	properties.load(input);
		        //properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(Constants.PATH_CONFFILE));
		    }catch(Exception ex){
		        ex.printStackTrace();
		    }
 
    }
	/** Get a property of the property file */
	public String getProperty(String key){
	    String result = null;
	    if(key !=null && !key.trim().isEmpty()){
	        result = this.properties.getProperty(key);
	    }
	    return result;
	}
	
	/** Override the clone method to ensure the "unique instance" requeriment of this class */
	public Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException();
	}
}
