package com.capgemaniac.util;

public class Constants {

		// Properties (user configurable)
		public static final String mkmAppToken = Propiedades.getInstance().getProperty(Propiedades.mkmAppToken);
		public static final String mkmAppSecret = Propiedades.getInstance().getProperty(Propiedades.mkmAppSecret);
		public static final String mkmAccessToken = Propiedades.getInstance().getProperty(Propiedades.mkmAccessToken);
		public static final String mkmAccessTokenSecret = Propiedades.getInstance().getProperty(Propiedades.mkmAccessTokenSecret);
		
		// Constants (not user configurable)
		public static final String PATH_CONFFILE = "/config.properties";
		public static final String URLCARDMARKET = "https://api.cardmarket.com/ws/v2.0/";
		public static final String ID_JUEGO_MAGIC = "1";
		public static final String ID_IDIOMA_INGLES = "1";
}
