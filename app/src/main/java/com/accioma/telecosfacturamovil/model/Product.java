package com.accioma.telecosfacturamovil.model;

/**
 * Created by marcelomora on 9/23/15.
 */
public class Product {
    private long id;
    private String name;
    private Float price;
    //El impuesto va quemado. Se puede arreglar luego para que sea un objeto y cambiar el calculo
    //Tax goes hardcoded until someone fix it so it can be a class. Next calculation will be added
    private String eanCode;
    private String phoneNumber; //Telecos vertical
    private String description;

    public Product(long id, String name, String description, String eanCode, Float price) {
        this.description = description;
        this.eanCode = eanCode;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getEanCode() {
        return eanCode;
    }

    public void setEanCode(String eanCode) {
        this.eanCode = eanCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
