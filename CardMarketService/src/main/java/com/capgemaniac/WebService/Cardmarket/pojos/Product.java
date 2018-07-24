package com.capgemaniac.WebService.Cardmarket.pojos;

public class Product
{
    private String idGame;

    private String expIcon;

    private Category category;

    private String expansion;

    private String countReprints;

    private String website;

    private Name[] name;

    private String rarity;

    private String image;

    private String idProduct;

    private String number;

    private PriceGuide priceGuide;

    private String idMetaproduct;

    public String getIdGame ()
    {
        return idGame;
    }

    public void setIdGame (String idGame)
    {
        this.idGame = idGame;
    }

    public String getExpIcon ()
    {
        return expIcon;
    }

    public void setExpIcon (String expIcon)
    {
        this.expIcon = expIcon;
    }

    public Category getCategory ()
    {
        return category;
    }

    public void setCategory (Category category)
    {
        this.category = category;
    }

    public String getExpansion ()
    {
        return expansion;
    }

    public void setExpansion (String expansion)
    {
        this.expansion = expansion;
    }

    public String getCountReprints ()
    {
        return countReprints;
    }

    public void setCountReprints (String countReprints)
    {
        this.countReprints = countReprints;
    }

    public String getWebsite ()
    {
        return website;
    }

    public void setWebsite (String website)
    {
        this.website = website;
    }

    public Name[] getName ()
    {
        return name;
    }

    public void setName (Name[] name)
    {
        this.name = name;
    }

    public String getRarity ()
    {
        return rarity;
    }

    public void setRarity (String rarity)
    {
        this.rarity = rarity;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public String getIdProduct ()
    {
        return idProduct;
    }

    public void setIdProduct (String idProduct)
    {
        this.idProduct = idProduct;
    }

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public PriceGuide getPriceGuide ()
    {
        return priceGuide;
    }

    public void setPriceGuide (PriceGuide priceGuide)
    {
        this.priceGuide = priceGuide;
    }

    public String getIdMetaproduct ()
    {
        return idMetaproduct;
    }

    public void setIdMetaproduct (String idMetaproduct)
    {
        this.idMetaproduct = idMetaproduct;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [idGame = "+idGame+", expIcon = "+expIcon+", category = "+category+", expansion = "+expansion+", countReprints = "+countReprints+", website = "+website+", name = "+name+", rarity = "+rarity+", image = "+image+", idProduct = "+idProduct+", number = "+number+", priceGuide = "+priceGuide+", idMetaproduct = "+idMetaproduct+"]";
    }
}
