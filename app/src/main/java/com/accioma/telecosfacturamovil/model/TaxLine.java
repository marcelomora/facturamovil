package com.accioma.telecosfacturamovil.model;

import java.io.Serializable;

/**
 * Created by marcelomora on 10/14/15.
 */
public class TaxLine implements Serializable {
    private long id;
    private Tax tax;
    private float baseAmount;

    public float getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(float baseAmount) {
        this.baseAmount = baseAmount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public float getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }

    private float taxAmount;

}
