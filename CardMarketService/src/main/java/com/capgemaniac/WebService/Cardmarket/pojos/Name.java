package com.capgemaniac.WebService.Cardmarket.pojos;

public class Name
{
    private String idLanguage;

    private String productName;

    private String languageName;

    public String getIdLanguage ()
    {
        return idLanguage;
    }

    public void setIdLanguage (String idLanguage)
    {
        this.idLanguage = idLanguage;
    }

    public String getProductName ()
    {
        return productName;
    }

    public void setProductName (String productName)
    {
        this.productName = productName;
    }

    public String getLanguageName ()
    {
        return languageName;
    }

    public void setLanguageName (String languageName)
    {
        this.languageName = languageName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [idLanguage = "+idLanguage+", productName = "+productName+", languageName = "+languageName+"]";
    }
}