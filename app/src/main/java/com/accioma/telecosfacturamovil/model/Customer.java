package com.accioma.telecosfacturamovil.model;

/**
 * Created by marcelomora on 9/23/15.
 */
public class Customer {
    private String firstname;
    private String lastname;
    private String fiscalId;
    private String fiscalIdType;
    private String address1;
    private String address2;
    private String phone1;
    private String phone2;

    public Customer(String fiscalId, String lastname, String firstname){
        this.fiscalId = fiscalId;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getFiscalId() {
        return fiscalId;
    }

    public void setFiscalId(String fiscalId) {
        this.fiscalId = fiscalId;
    }

    public String getFiscalIdType() {
        return fiscalIdType;
    }

    public void setFiscalIdType(String fiscalIdType) {
        this.fiscalIdType = fiscalIdType;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    private String phone3;

}
