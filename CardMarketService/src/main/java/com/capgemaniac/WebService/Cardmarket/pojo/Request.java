//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen.
// Generado el: 2018.07.23 a las 01:00:59 PM CEST
//


package com.capgemaniac.WebService.Cardmarket.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="article">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="idLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="isFoil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="isSigned" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="isPlayset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "article"
})
@XmlRootElement(name = "request")
public class Request {

    @XmlElement(required = true)
    protected Request.Article article;

    /**
     * Obtiene el valor de la propiedad article.
     *
     * @return
     *     possible object is
     *     {@link Request.Article }
     *
     */
    public Request.Article getArticle() {
        return article;
    }

    /**
     * Define el valor de la propiedad article.
     *
     * @param value
     *     allowed object is
     *     {@link Request.Article }
     *
     */
    public void setArticle(Request.Article value) {
        this.article = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="idLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="isFoil" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="isSigned" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="isPlayset" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idProduct",
        "idLanguage",
        "comments",
        "count",
        "price",
        "condition",
        "isFoil",
        "isSigned",
        "isPlayset"
    })
    public static class Article {

    	@XmlElement(required = true)
        protected int idProduct;
    	@XmlElement(required = true)
        protected int idLanguage;
        protected String comments;
        @XmlElement(required = true)
        protected int count;
        @XmlElement(required = true)
        protected float price;

        protected String condition;
        protected boolean isFoil;
        protected boolean isSigned;
        protected boolean isPlayset;

        /**
         * Obtiene el valor de la propiedad idProduct.
         *
         */
        public int getIdProduct() {
            return idProduct;
        }

        /**
         * Define el valor de la propiedad idProduct.
         *
         */
        public void setIdProduct(int value) {
            this.idProduct = value;
        }

        /**
         * Obtiene el valor de la propiedad idLanguage.
         *
         */
        public int getIdLanguage() {
            return idLanguage;
        }

        /**
         * Define el valor de la propiedad idLanguage.
         *
         */
        public void setIdLanguage(int value) {
            this.idLanguage = value;
        }

        /**
         * Obtiene el valor de la propiedad comments.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getComments() {
            return comments;
        }

        /**
         * Define el valor de la propiedad comments.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setComments(String value) {
            this.comments = value;
        }

        /**
         * Obtiene el valor de la propiedad count.
         *
         */
        public int getCount() {
            return count;
        }

        /**
         * Define el valor de la propiedad count.
         *
         */
        public void setCount(int value) {
            this.count = value;
        }

        /**
         * Obtiene el valor de la propiedad price.
         *
         */
        public float getPrice() {
            return price;
        }

        /**
         * Define el valor de la propiedad price.
         *
         */
        public void setPrice(float value) {
            this.price = value;
        }

        /**
         * Obtiene el valor de la propiedad condition.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCondition() {
            return condition;
        }

        /**
         * Define el valor de la propiedad condition.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCondition(String value) {
            this.condition = value;
        }

        /**
         * Obtiene el valor de la propiedad isFoil.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public boolean getIsFoil() {
            return isFoil;
        }

        /**
         * Define el valor de la propiedad isFoil.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIsFoil(boolean value) {
            this.isFoil = value;
        }

        /**
         * Obtiene el valor de la propiedad isSigned.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public boolean getIsSigned() {
            return isSigned;
        }

        /**
         * Define el valor de la propiedad isSigned.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIsSigned(boolean value) {
            this.isSigned = value;
        }

        /**
         * Obtiene el valor de la propiedad isPlayset.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public boolean getIsPlayset() {
            return isPlayset;
        }

        /**
         * Define el valor de la propiedad isPlayset.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIsPlayset(boolean value) {
            this.isPlayset = value;
        }

    }

}
