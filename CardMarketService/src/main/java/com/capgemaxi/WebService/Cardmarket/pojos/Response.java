package com.capgemaxi.WebService.Cardmarket.pojos;

public class Response
{
    private Product[] product;

    public Product[] getProduct ()
    {
        return product;
    }

    public void setProduct (Product[] product)
    {
        this.product = product;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [product = "+product+"]";
    }
}