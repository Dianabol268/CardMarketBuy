package com.capgemaniac.util;

public class Constants {

		// Properties (user configurable)
		public static final String mkmAppToken = Propiedades.getInstance().getProperty(Propiedades.mkmAppToken);
		public static final String mkmAppSecret = Propiedades.getInstance().getProperty(Propiedades.mkmAppSecret);
		public static final String mkmAccessToken = Propiedades.getInstance().getProperty(Propiedades.mkmAccessToken);
		public static final String mkmAccessTokenSecret = Propiedades.getInstance().getProperty(Propiedades.mkmAccessTokenSecret);
		public static final String URLCARDMARKET = Propiedades.getInstance().getProperty(Propiedades.URLCARDMARKET);
		public static final String ID_JUEGO_MAGIC = Propiedades.getInstance().getProperty(Propiedades.ID_JUEGO_MAGIC);
		public static final String ID_IDIOMA_INGLES = Propiedades.getInstance().getProperty(Propiedades.ID_IDIOMA_INGLES);
		
		// Constants (not user configurable)
		public static final String PATH_CONFFILE = "/config.properties";
		
}
