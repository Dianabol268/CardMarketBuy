package com.capgemaniac.WebService.Cardmarket.Arquitectura;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.capgemaniac.WebService.Cardmarket.pojo.Request;
import com.capgemaniac.util.Utilidades;

/**
 * Clase que gestiona todas las llamadas a el webService de negocio de MKM
 * @author Astur
 *
 */
public class WebServiceCall {

       private String mkmAppToken;
       private String mkmAppSecret;
       private String mkmAccessToken;
       private String mkmAccessTokenSecret;

       private Throwable lastError;
       private int lastCode;
       private StringBuffer lastContent;
       private boolean debugDE;
       Logger log;

       /**
        * Constructor.
     * @param log

        */
       public WebServiceCall(Logger log) {
           mkmAppToken = WebServiceProperties.mkmAppToken;
           mkmAppSecret = WebServiceProperties.mkmAppSecret;
           mkmAccessToken = WebServiceProperties.mkmAccessToken;
           mkmAccessTokenSecret = WebServiceProperties.mkmAccessTokenSecret;
           this.log= log;
           lastError = null;
       }

       private String obtenerSignature(String requestURL, String tipoSignature) {
    	   try {
    	   String realm = requestURL ;
           String oauth_version = "1.0" ;
           String oauth_consumer_key = mkmAppToken ;
           String oauth_token = mkmAccessToken ;
           String oauth_signature_method = "HMAC-SHA1" ;
           // String oauth_timestamp = "" + (System.currentTimeMillis()/1000) ;
           String oauth_timestamp = "1407917892" ;
           // String oauth_nonce = "" + System.currentTimeMillis() ;
           String oauth_nonce = "53eb1f44909d6" ;


           String encodedRequestURL = rawurlencode(requestURL) ;

           String baseString = tipoSignature + "&" + encodedRequestURL + "&" ;

           String paramString = "oauth_consumer_key=" + rawurlencode(oauth_consumer_key) + "&" +
                                "oauth_nonce=" + rawurlencode(oauth_nonce) + "&" +
                                "oauth_signature_method=" + rawurlencode(oauth_signature_method) + "&" +
                                "oauth_timestamp=" + rawurlencode(oauth_timestamp) + "&" +
                                "oauth_token=" + rawurlencode(oauth_token) + "&" +
                                "oauth_version=" + rawurlencode(oauth_version) ;

           baseString = baseString + rawurlencode(paramString) ;

           String signingKey = rawurlencode(mkmAppSecret) +
                       "&" +
                       rawurlencode(mkmAccessTokenSecret) ;

           Mac mac = Mac.getInstance("HmacSHA1");
           SecretKeySpec secret = new SecretKeySpec(signingKey.getBytes(), mac.getAlgorithm());
           mac.init(secret);
           byte[] digest = mac.doFinal(baseString.getBytes());
           String oauth_signature =  DatatypeConverter.printBase64Binary(digest);    //Base64.encode(digest) ;
           String authorizationProperty =
                   "OAuth " +
                   "realm=\"" + realm + "\", " +
                   "oauth_version=\"" + oauth_version + "\", " +
                   "oauth_timestamp=\"" + oauth_timestamp + "\", " +
                   "oauth_nonce=\"" + oauth_nonce + "\", " +
                   "oauth_consumer_key=\"" + oauth_consumer_key + "\", " +
                   "oauth_token=\"" + oauth_token + "\", " +
                   "oauth_signature_method=\"" + oauth_signature_method + "\", " +
                   "oauth_signature=\"" + oauth_signature + "\""
                   ;
           return authorizationProperty;
    	   }
    	   catch (Exception e) {
        	   log.log(Level.SEVERE,"(!) Error while requesting obtenerSignature:" +requestURL);
               lastError = e;
           }
    	   return "";
       }




       /**
        * Metodo PARA PETICIONES GET que nos devuelve en un String la salida que devuelva la llamada a MKM
        * @param requestURL url to be requested. Ex. https://www.mkmapi.eu/ws/v1.1/products/island/1/1/false
        * @return true if request was successfully executed. You can retrieve the content with responseContent();
        */
       public boolean requestMKMGet(String requestURL) {
           lastError = null;
           lastCode = 0;
           lastContent = new StringBuffer();
           HttpURLConnection connection=null;
           try {
        	   Utilidades.escribirLogInfo("Requesting "+requestURL, log);

               connection = (HttpURLConnection) new URL(requestURL).openConnection();
               connection.addRequestProperty("Authorization", obtenerSignature(requestURL, "GET")) ;

               connection.connect() ;

               // from here standard actions...
               // read response code... read input stream.... close connection...

               lastCode = connection.getResponseCode();

               Utilidades.escribirLogInfo("Response Code is \"+lastCode", log);

               if (200 == lastCode || 401 == lastCode || 404 == lastCode) {
                   BufferedReader rd = new BufferedReader(new InputStreamReader(lastCode==200?connection.getInputStream():connection.getErrorStream()));
                   StringBuffer sb = new StringBuffer();
                   String line;
                   while ((line = rd.readLine()) != null) {
                       sb.append(line);
                   }
                   rd.close();
                   lastContent = sb;
                   Utilidades.escribirLogInfo("Response Content is \n"+lastContent, log);
               }

               return (lastCode == 200);

           } catch (Exception e) {
        	   log.log(Level.SEVERE,"(!) Error while requesting :" +requestURL);
               lastError = e;
           }
           finally {
        	   if(connection!=null) {
        		   connection.disconnect();
        	   }
           }

           return false;
       }

       /**
        * Metodo PARA PETICIONES POST que nos devuelve en un String la salida que devuelva la llamada a MKM
        * @param requestURL url to be requested. Ex. https://www.mkmapi.eu/ws/v1.1/products/island/1/1/false
        * @return true if request was successfully executed. You can retrieve the content with responseContent();
        */
       public boolean requestMKMPost(String requestURL, Object objetoPost) {
           lastError = null;
           lastCode = 0;
           lastContent = new StringBuffer();
           HttpURLConnection connection = null;

           try {
        	   Utilidades.escribirLogInfo("Requesting "+requestURL, log);

                connection = (HttpURLConnection) new URL(requestURL).openConnection();
               connection.addRequestProperty("Authorization", obtenerSignature(requestURL, "POST")) ;
               connection.setDoOutput(true);
               connection.setRequestMethod("POST");
               connection.connect();


               OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");

               JAXBContext jaxbContext = JAXBContext.newInstance(objetoPost.getClass());
               java.io.StringWriter sw = new StringWriter();
               Marshaller marshaller = jaxbContext.createMarshaller();
               marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
               marshaller.marshal(objetoPost, sw);
               String asd = sw.toString();
               writer.write(asd);
               writer.close();

               // from here standard actions...
               // read response code... read input stream.... close connection...

               lastCode = connection.getResponseCode();

               Utilidades.escribirLogInfo("Response Code is \""+lastCode, log);

               if (200 == lastCode || 404 == lastCode) {
                   BufferedReader rd = new BufferedReader(new InputStreamReader(lastCode==200?connection.getInputStream():connection.getErrorStream()));
                   StringBuffer sb = new StringBuffer();
                   String line;
                   while ((line = rd.readLine()) != null) {
                       sb.append(line);
                   }
                   rd.close();
                   lastContent = sb;
                   Utilidades.escribirLogInfo("Response Content is \n"+lastContent, log);
               }

               return (lastCode == 200);

           } catch (Exception e) {
        	   log.log(Level.SEVERE,"(!) Error while requesting :" +requestURL);
               lastError = e;
           }
           finally {
        	   if(connection!=null) {
        		   connection.disconnect();
        	   }

           }
           return false;
       }

       //SET/get de cmapos de la clase



       /**
        * Encoding function. To avoid deprecated version, the encoding used is UTF-8.
        * @param str
        * @return
        * @throws UnsupportedEncodingException
        */
       private String rawurlencode(String str) throws UnsupportedEncodingException {
           return URLEncoder.encode(str, "UTF-8");
       }


       /**
        * Get last Error exception.
        * @return null if no errors; instead the raised exception.
        */
       public Throwable lastError() {
           return lastError;
       }

       /**
        * Get response code from last request.
        * @return
        */
       public int responseCode() {
           return lastCode;
       }

       /**
        * Get response content from last request.
     * @param log
        * @return
        */
       public StringBuffer responseContent() {
           return lastContent;
       }

       //fin SET/get de cmapos de la clase



   }