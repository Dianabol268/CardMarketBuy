//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.07.18 a las 11:35:15 AM CEST 
//


package com.capgemaxi.WebService.Cardmarket.pojo;

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
 *                   &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="idMetaproduct" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="idGame" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="countReprints" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idLanguage" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="languageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="category">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="idCategory" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="expansion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="expIcon" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="idMetaproduct" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="idGame" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="countReprints" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idLanguage" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="languageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="website" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="category">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="idCategory" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *         &lt;element name="expansion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="expIcon" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "idGame",
        "countReprints",
        "name",
        "website",
        "image",
        "category",
        "priceGuide",
        "expansion",
        "expIcon",
        "number",
        "rarity"
    })
    public static class Product {

        protected int idProduct;
        protected short idMetaproduct;
        protected byte idGame;
        @XmlElement(required = true)
        protected String countReprints;
        protected List<Response.Product.Name> name;
        @XmlElement(required = true)
        protected String website;
        @XmlElement(required = true)
        protected String image;
        @XmlElement(required = true)
        protected Response.Product.Category category;
        @XmlElement(required = true)
        protected Response.Product.PriceGuide priceGuide;
        @XmlElement(required = true)
        protected String expansion;
        protected short expIcon;
        protected String number;
        protected String rarity;

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
         * Obtiene el valor de la propiedad countReprints.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountReprints() {
            return countReprints;
        }

        /**
         * Define el valor de la propiedad countReprints.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountReprints(String value) {
            this.countReprints = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the name property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Response.Product.Name }
         * 
         * 
         */
        public List<Response.Product.Name> getName() {
            if (name == null) {
                name = new ArrayList<Response.Product.Name>();
            }
            return this.name;
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
         * Obtiene el valor de la propiedad category.
         * 
         * @return
         *     possible object is
         *     {@link Response.Product.Category }
         *     
         */
        public Response.Product.Category getCategory() {
            return category;
        }

        /**
         * Define el valor de la propiedad category.
         * 
         * @param value
         *     allowed object is
         *     {@link Response.Product.Category }
         *     
         */
        public void setCategory(Response.Product.Category value) {
            this.category = value;
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

        /**
         * Obtiene el valor de la propiedad number.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Define el valor de la propiedad number.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
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
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="idCategory" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "idCategory",
            "categoryName"
        })
        public static class Category {

            protected byte idCategory;
            @XmlElement(required = true)
            protected String categoryName;

            /**
             * Obtiene el valor de la propiedad idCategory.
             * 
             */
            public byte getIdCategory() {
                return idCategory;
            }

            /**
             * Define el valor de la propiedad idCategory.
             * 
             */
            public void setIdCategory(byte value) {
                this.idCategory = value;
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
         *         &lt;element name="idLanguage" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="languageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "idLanguage",
            "languageName",
            "productName"
        })
        public static class Name {

            protected byte idLanguage;
            @XmlElement(required = true)
            protected String languageName;
            @XmlElement(required = true)
            protected String productName;

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

            /**
             * Obtiene el valor de la propiedad productName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductName() {
                return productName;
            }

            /**
             * Define el valor de la propiedad productName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductName(String value) {
                this.productName = value;
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

    }

}
