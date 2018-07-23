//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.07.23 a las 11:10:01 AM CEST 
//


package com.capgemaxi.WebService.Cardmarket.pojo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.capgemaxi.WebService.Cardmarket.pojo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.capgemaxi.WebService.Cardmarket.pojo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Response.Product }
     * 
     */
    public Response.Product createResponseProduct() {
        return new Response.Product();
    }

    /**
     * Create an instance of {@link Response.Product.Name }
     * 
     */
    public Response.Product.Name createResponseProductName() {
        return new Response.Product.Name();
    }

    /**
     * Create an instance of {@link Response.Product.Category }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Request.Article }
     * 
     */
    public Request.Article createRequestArticle() {
        return new Request.Article();
    }
    
    public Response.Product.Category createResponseProductCategory() {
        return new Response.Product.Category();
    }

    /**
     * Create an instance of {@link Response.Product.PriceGuide }
     * 
     */
    public Response.Product.PriceGuide createResponseProductPriceGuide() {
        return new Response.Product.PriceGuide();
    }
}
