package com.capgemaxi.WebService.Cardmarket.pojos;

public class Category
{
    private String categoryName;

    private String idCategory;

    public String getCategoryName ()
    {
        return categoryName;
    }

    public void setCategoryName (String categoryName)
    {
        this.categoryName = categoryName;
    }

    public String getIdCategory ()
    {
        return idCategory;
    }

    public void setIdCategory (String idCategory)
    {
        this.idCategory = idCategory;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [categoryName = "+categoryName+", idCategory = "+idCategory+"]";
    }
}