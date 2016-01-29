package com.accioma.telecosfacturamovil.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table AUTHORIZATION.
 */
public class Authorization {

    private Long id;
    private String ruc_company;
    private String estab;
    private String ptoEmi;
    private Integer nextSecuencial;
    private Integer padding;
    private Boolean active;

    public Authorization() {
    }

    public Authorization(Long id) {
        this.id = id;
    }

    public Authorization(Long id, String ruc_company, String estab, String ptoEmi, Integer nextSecuencial, Integer padding, Boolean active) {
        this.id = id;
        this.ruc_company = ruc_company;
        this.estab = estab;
        this.ptoEmi = ptoEmi;
        this.nextSecuencial = nextSecuencial;
        this.padding = padding;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRuc_company() {
        return ruc_company;
    }

    public void setRuc_company(String ruc_company) {
        this.ruc_company = ruc_company;
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

    public Integer getNextSecuencial() {
        return nextSecuencial;
    }

    public void setNextSecuencial(Integer nextSecuencial) {
        this.nextSecuencial = nextSecuencial;
    }

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
