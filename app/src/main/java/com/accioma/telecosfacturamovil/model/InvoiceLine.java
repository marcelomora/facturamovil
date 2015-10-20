package com.accioma.telecosfacturamovil.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcelomora on 10/14/15.
 */
public class InvoiceLine implements Serializable {
    private long id;
    private long invoiceId;
    private Product product;
    private float unitPrice;
    private float qtty;
    private float subtotalPrice;
    private float discount;
    private float discountPercent;
    private List<TaxLine> taxes;

    public InvoiceLine(long invoiceId, long id, float qtty, Product product,
                       float subtotalPrice,long taxIds[], float unitPrice) {
        this.invoiceId = invoiceId;
        this.id = id;
        this.product = product;
        this.qtty = qtty;
        this.subtotalPrice = subtotalPrice;
        this.unitPrice = unitPrice;

        List<TaxLine> taxLines = new ArrayList<TaxLine>();
        for(long taxId : taxIds){
            taxLines.add(new TaxLine(1L, id, subtotalPrice, TaxDAO.readAll().get((int)taxId)));
        }
    }

    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
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
