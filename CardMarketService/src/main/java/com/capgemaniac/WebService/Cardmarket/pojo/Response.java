//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.07.25 a las 11:36:20 AM CEST 
//


package com.capgemaniac.WebService.Cardmarket.pojo;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="product" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="idMetaproduct" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="countReprints" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="enName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="locName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="localization" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="idLanguage" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="languageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="gameName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="idGame" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="expansion">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idExpansion" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="enName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="expansionIcon" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="priceGuide">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SELL" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="LOW" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="LOWEX" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="LOWFOIL" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="AVG" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="TREND" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="reprint" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="expansion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="expIcon" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="countArticles" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="countFoils" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="links" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "product"
})
@XmlRootElement(name = "response")
public class Response {

    protected List<Response.Product> product;
    protected List<Request.Article> article;
    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Response.Product }
     * 
     * 
     */
    public List<Response.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<Response.Product>();
        }
        return this.product;
    }

    public List<Request.Article> getArticle() {
        if (article == null) {
            article = new ArrayList<Request.Article>();
        }
        return this.article;
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
     *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="idMetaproduct" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="countReprints" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="enName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="locName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="localization" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="idLanguage" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="languageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="gameName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="idGame" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="expansion">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idExpansion" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="enName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="expansionIcon" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="priceGuide">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SELL" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="LOW" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="LOWEX" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="LOWFOIL" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="AVG" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="TREND" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="reprint" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="expansion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="expIcon" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="countArticles" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="countFoils" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="links" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idProduct",
        "idMetaproduct",
        "countReprints",
        "enName",
        "locName",
        "localization",
        "website",
        "image",
        "gameName",
        "categoryName",
        "idGame",
        "number",
        "rarity",
        "expansion",
        "expansionName",
        "priceGuide",
        "reprint",
        "countArticles",
        "countFoils",
        "links"
    })
    public static class Product {

        protected byte idProduct;
        protected short idMetaproduct;
        protected byte countReprints;
        @XmlElement(required = true)
        protected String enName;
        @XmlElement(required = true)
        protected String locName;
        protected List<Response.Product.Localization> localization;
        @XmlElement(required = true)
        protected String website;
        @XmlElement(required = true)
        protected String image;
        @XmlElement(required = true)
        protected String gameName;
        @XmlElement(required = true)
        protected String categoryName;
        protected byte idGame;
        protected byte number;
        @XmlElement(required = true)
        protected String rarity;
        @XmlElement(required = true)
        protected Response.Product.Expansion expansion;
        @XmlElement(required = true)
        protected String expansionName;
        @XmlElement(required = true)
        protected Response.Product.PriceGuide priceGuide;
        protected List<Response.Product.Reprint> reprint;
        protected short countArticles;
        protected byte countFoils;
        protected List<Response.Product.Links> links;

        /**
         * Obtiene el valor de la propiedad idProduct.
         * 
         */
        public byte getIdProduct() {
            return idProduct;
        }

        /**
         * Define el valor de la propiedad idProduct.
         * 
         */
        public void setIdProduct(byte value) {
            this.idProduct = value;
        }

        /**
         * Obtiene el valor de la propiedad idMetaproduct.
         * 
         */
        public short getIdMetaproduct() {
            return idMetaproduct;
        }

        /**
         * Define el valor de la propiedad idMetaproduct.
         * 
         */
        public void setIdMetaproduct(short value) {
            this.idMetaproduct = value;
        }

        /**
         * Obtiene el valor de la propiedad countReprints.
         * 
         */
        public byte getCountReprints() {
            return countReprints;
        }

        /**
         * Define el valor de la propiedad countReprints.
         * 
         */
        public void setCountReprints(byte value) {
            this.countReprints = value;
        }

        /**
         * Obtiene el valor de la propiedad enName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnName() {
            return enName;
        }

        /**
         * Define el valor de la propiedad enName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnName(String value) {
            this.enName = value;
        }

        /**
         * Obtiene el valor de la propiedad locName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocName() {
            return locName;
        }

        /**
         * Define el valor de la propiedad locName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocName(String value) {
            this.locName = value;
        }

        /**
         * Gets the value of the localization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the localization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocalization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Product.Localization }
         * 
         * 
         */
        public List<Response.Product.Localization> getLocalization() {
            if (localization == null) {
                localization = new ArrayList<Response.Product.Localization>();
            }
            return this.localization;
        }

        /**
         * Obtiene el valor de la propiedad website.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebsite() {
            return website;
        }

        /**
         * Define el valor de la propiedad website.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebsite(String value) {
            this.website = value;
        }

        /**
         * Obtiene el valor de la propiedad image.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImage() {
            return image;
        }

        /**
         * Define el valor de la propiedad image.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImage(String value) {
            this.image = value;
        }

        /**
         * Obtiene el valor de la propiedad gameName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGameName() {
            return gameName;
        }

        /**
         * Define el valor de la propiedad gameName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGameName(String value) {
            this.gameName = value;
        }

        /**
         * Obtiene el valor de la propiedad categoryName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoryName() {
            return categoryName;
        }

        /**
         * Define el valor de la propiedad categoryName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoryName(String value) {
            this.categoryName = value;
        }

        /**
         * Obtiene el valor de la propiedad idGame.
         * 
         */
        public byte getIdGame() {
            return idGame;
        }

        /**
         * Define el valor de la propiedad idGame.
         * 
         */
        public void setIdGame(byte value) {
            this.idGame = value;
        }

        /**
         * Obtiene el valor de la propiedad number.
         * 
         */
        public byte getNumber() {
            return number;
        }

        /**
         * Define el valor de la propiedad number.
         * 
         */
        public void setNumber(byte value) {
            this.number = value;
        }

        /**
         * Obtiene el valor de la propiedad rarity.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRarity() {
            return rarity;
        }

        /**
         * Define el valor de la propiedad rarity.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRarity(String value) {
            this.rarity = value;
        }

        /**
         * Obtiene el valor de la propiedad expansion.
         * 
         * @return
         *     possible object is
         *     {@link Response.Product.Expansion }
         *     
         */
        public Response.Product.Expansion getExpansion() {
            return expansion;
        }

        /**
         * Define el valor de la propiedad expansion.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Product.Expansion }
         *     
         */
        public void setExpansion(Response.Product.Expansion value) {
            this.expansion = value;
        }
        
        /**
         * Obtiene el valor de la propiedad expansion.
         * 
         * @return
         *     possible object is
         *     {@link Response.Product.Expansion }
         *     
         */
        public String getExpansionName() {
            return expansionName;
        }

        /**
         * Define el valor de la propiedad expansion.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Product.Expansion }
         *     
         */
        public void setExpansionName(String value) {
            this.expansionName = value;
        }

        /**
         * Obtiene el valor de la propiedad priceGuide.
         * 
         * @return
         *     possible object is
         *     {@link Response.Product.PriceGuide }
         *     
         */
        public Response.Product.PriceGuide getPriceGuide() {
            return priceGuide;
        }

        /**
         * Define el valor de la propiedad priceGuide.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Product.PriceGuide }
         *     
         */
        public void setPriceGuide(Response.Product.PriceGuide value) {
            this.priceGuide = value;
        }

        /**
         * Gets the value of the reprint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reprint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReprint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Product.Reprint }
         * 
         * 
         */
        public List<Response.Product.Reprint> getReprint() {
            if (reprint == null) {
                reprint = new ArrayList<Response.Product.Reprint>();
            }
            return this.reprint;
        }

        /**
         * Obtiene el valor de la propiedad countArticles.
         * 
         */
        public short getCountArticles() {
            return countArticles;
        }

        /**
         * Define el valor de la propiedad countArticles.
         * 
         */
        public void setCountArticles(short value) {
            this.countArticles = value;
        }

        /**
         * Obtiene el valor de la propiedad countFoils.
         * 
         */
        public byte getCountFoils() {
            return countFoils;
        }

        /**
         * Define el valor de la propiedad countFoils.
         * 
         */
        public void setCountFoils(byte value) {
            this.countFoils = value;
        }

        /**
         * Gets the value of the links property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the links property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinks().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Product.Links }
         * 
         * 
         */
        public List<Response.Product.Links> getLinks() {
            if (links == null) {
                links = new ArrayList<Response.Product.Links>();
            }
            return this.links;
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
         *         &lt;element name="idExpansion" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="enName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="expansionIcon" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
            "idExpansion",
            "enName",
            "expansionIcon"
        })
        public static class Expansion {

            protected byte idExpansion;
            @XmlElement(required = true)
            protected String enName;
            protected byte expansionIcon;

            /**
             * Obtiene el valor de la propiedad idExpansion.
             * 
             */
            public byte getIdExpansion() {
                return idExpansion;
            }

            /**
             * Define el valor de la propiedad idExpansion.
             * 
             */
            public void setIdExpansion(byte value) {
                this.idExpansion = value;
            }

            /**
             * Obtiene el valor de la propiedad enName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnName() {
                return enName;
            }

            /**
             * Define el valor de la propiedad enName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnName(String value) {
                this.enName = value;
            }

            /**
             * Obtiene el valor de la propiedad expansionIcon.
             * 
             */
            public byte getExpansionIcon() {
                return expansionIcon;
            }

            /**
             * Define el valor de la propiedad expansionIcon.
             * 
             */
            public void setExpansionIcon(byte value) {
                this.expansionIcon = value;
            }

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
         *         &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "rel",
            "href",
            "method"
        })
        public static class Links {

            @XmlElement(required = true)
            protected String rel;
            @XmlElement(required = true)
            protected String href;
            @XmlElement(required = true)
            protected String method;

            /**
             * Obtiene el valor de la propiedad rel.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRel() {
                return rel;
            }

            /**
             * Define el valor de la propiedad rel.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRel(String value) {
                this.rel = value;
            }

            /**
             * Obtiene el valor de la propiedad href.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHref() {
                return href;
            }

            /**
             * Define el valor de la propiedad href.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHref(String value) {
                this.href = value;
            }

            /**
             * Obtiene el valor de la propiedad method.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMethod() {
                return method;
            }

            /**
             * Define el valor de la propiedad method.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMethod(String value) {
                this.method = value;
            }

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
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="idLanguage" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="languageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "name",
            "idLanguage",
            "languageName"
        })
        public static class Localization {

            @XmlElement(required = true)
            protected String name;
            protected byte idLanguage;
            @XmlElement(required = true)
            protected String languageName;

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad idLanguage.
             * 
             */
            public byte getIdLanguage() {
                return idLanguage;
            }

            /**
             * Define el valor de la propiedad idLanguage.
             * 
             */
            public void setIdLanguage(byte value) {
                this.idLanguage = value;
            }

            /**
             * Obtiene el valor de la propiedad languageName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLanguageName() {
                return languageName;
            }

            /**
             * Define el valor de la propiedad languageName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLanguageName(String value) {
                this.languageName = value;
            }

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
         *         &lt;element name="SELL" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="LOW" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="LOWEX" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="LOWFOIL" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="AVG" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="TREND" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
            "sell",
            "low",
            "lowex",
            "lowfoil",
            "avg",
            "trend"
        })
        public static class PriceGuide {

            @XmlElement(name = "SELL")
            protected float sell;
            @XmlElement(name = "LOW")
            protected float low;
            @XmlElement(name = "LOWEX")
            protected float lowex;
            @XmlElement(name = "LOWFOIL")
            protected float lowfoil;
            @XmlElement(name = "AVG")
            protected float avg;
            @XmlElement(name = "TREND")
            protected float trend;

            /**
             * Obtiene el valor de la propiedad sell.
             * 
             */
            public float getSELL() {
                return sell;
            }

            /**
             * Define el valor de la propiedad sell.
             * 
             */
            public void setSELL(float value) {
                this.sell = value;
            }

            /**
             * Obtiene el valor de la propiedad low.
             * 
             */
            public float getLOW() {
                return low;
            }

            /**
             * Define el valor de la propiedad low.
             * 
             */
            public void setLOW(float value) {
                this.low = value;
            }

            /**
             * Obtiene el valor de la propiedad lowex.
             * 
             */
            public float getLOWEX() {
                return lowex;
            }

            /**
             * Define el valor de la propiedad lowex.
             * 
             */
            public void setLOWEX(float value) {
                this.lowex = value;
            }

            /**
             * Obtiene el valor de la propiedad lowfoil.
             * 
             */
            public float getLOWFOIL() {
                return lowfoil;
            }

            /**
             * Define el valor de la propiedad lowfoil.
             * 
             */
            public void setLOWFOIL(float value) {
                this.lowfoil = value;
            }

            /**
             * Obtiene el valor de la propiedad avg.
             * 
             */
            public float getAVG() {
                return avg;
            }

            /**
             * Define el valor de la propiedad avg.
             * 
             */
            public void setAVG(float value) {
                this.avg = value;
            }

            /**
             * Obtiene el valor de la propiedad trend.
             * 
             */
            public float getTREND() {
                return trend;
            }

            /**
             * Define el valor de la propiedad trend.
             * 
             */
            public void setTREND(float value) {
                this.trend = value;
            }

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
         *         &lt;element name="expansion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="expIcon" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
            "expansion",
            "expIcon"
        })
        public static class Reprint {

            protected int idProduct;
            @XmlElement(required = true)
            protected String expansion;
            protected short expIcon;

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
             * Obtiene el valor de la propiedad expansion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpansion() {
                return expansion;
            }

            /**
             * Define el valor de la propiedad expansion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpansion(String value) {
                this.expansion = value;
            }

            /**
             * Obtiene el valor de la propiedad expIcon.
             * 
             */
            public short getExpIcon() {
                return expIcon;
            }

            /**
             * Define el valor de la propiedad expIcon.
             * 
             */
            public void setExpIcon(short value) {
                this.expIcon = value;
            }

        }

    }

}
