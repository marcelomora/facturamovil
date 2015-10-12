package com.accioma.telecosfacturamovil.model;

import java.util.Date;

/**
 * Created by marcelomora on 9/23/15.
 */
public class Invoice {
    private String name;
    private Customer customer;
    private Date dateInvoiced;
    private Float amountTotal;
    private String secuencial;
    private String ptoEmi;
    private String estab;


    public Invoice(Float amountTotal, Customer customer,
                   Date dateInvoiced, String estab,
                   String ptoEmi, String secuencial) {
        this.amountTotal = amountTotal;
        this.customer = customer;
        this.dateInvoiced = dateInvoiced;
        this.estab = estab;
        this.name = "";
        this.ptoEmi = ptoEmi;
        this.secuencial = secuencial;
    }

    public String getEstab() {
        return estab;
    }

    public void setEstab(String estab) {
        this.estab = estab;
    }

    public String getPtoEmi() {
        return ptoEmi;
    }

    public void setPtoEmi(String ptoEmi) {
        this.ptoEmi = ptoEmi;
    }

    public String getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(String secuencial) {
        this.secuencial = secuencial;
    }

    public Float getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(Float amountTotal) {
        this.amountTotal = amountTotal;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateInvoiced() {
        return dateInvoiced;
    }

    public void setDateInvoiced(Date dateInvoiced) {
        this.dateInvoiced = dateInvoiced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInvoiceNumber(){
        return estab + "-" + ptoEmi + "-" + secuencial;
    }
}
