package com.accioma.telecosfacturamovil.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marcelomora on 10/14/15.
 */
public class InvoiceLine implements Serializable {
    private long id;
    private Product product;
    private float unitPrice;
    private float qtty;
    private float subtotalPrice;
    private float discount;
    private float discountPercent;
    private List<TaxLine> taxes;

    public InvoiceLine(float discount, float discountPercent, long id, Product product, float qtty, float subtotalPrice, List<TaxLine> taxes, float unitPrice) {
        this.discount = discount;
        this.discountPercent = discountPercent;
        this.id = id;
        this.product = product;
        this.qtty = qtty;
        this.subtotalPrice = subtotalPrice;
        this.taxes = taxes;
        this.unitPrice = unitPrice;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(float discountPercent) {
        this.discountPercent = discountPercent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getQtty() {
        return qtty;
    }

    public void setQtty(float qtty) {
        this.qtty = qtty;
    }

    public float getSubtotalPrice() {
        return subtotalPrice;
    }

    public void setSubtotalPrice(float subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public List<TaxLine> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<TaxLine> taxes) {
        this.taxes = taxes;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
