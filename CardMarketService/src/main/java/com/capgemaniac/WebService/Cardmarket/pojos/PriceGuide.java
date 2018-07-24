package com.capgemaniac.WebService.Cardmarket.pojos;

public class PriceGuide
{
    private String LOWEX;

    private String LOWFOIL;

    private String SELL;

    private String LOW;

    private String AVG;

    private String TREND;

    public String getLOWEX ()
    {
        return LOWEX;
    }

    public void setLOWEX (String LOWEX)
    {
        this.LOWEX = LOWEX;
    }

    public String getLOWFOIL ()
    {
        return LOWFOIL;
    }

    public void setLOWFOIL (String LOWFOIL)
    {
        this.LOWFOIL = LOWFOIL;
    }

    public String getSELL ()
    {
        return SELL;
    }

    public void setSELL (String SELL)
    {
        this.SELL = SELL;
    }

    public String getLOW ()
    {
        return LOW;
    }

    public void setLOW (String LOW)
    {
        this.LOW = LOW;
    }

    public String getAVG ()
    {
        return AVG;
    }

    public void setAVG (String AVG)
    {
        this.AVG = AVG;
    }

    public String getTREND ()
    {
        return TREND;
    }

    public void setTREND (String TREND)
    {
        this.TREND = TREND;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [LOWEX = "+LOWEX+", LOWFOIL = "+LOWFOIL+", SELL = "+SELL+", LOW = "+LOW+", AVG = "+AVG+", TREND = "+TREND+"]";
    }
}