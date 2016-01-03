package com.accioma;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class TFMDaoGenerator {
    public static void main(String args[]){
        Schema schema = new Schema(1, "com.accioma.telecosfacturamovil.model");

        Entity customer = schema.addEntity("Customer");

        customer.addIdProperty();
        customer.addStringProperty("name");
        customer.addStringProperty("lastname");
        customer.addStringProperty("firstname");
        customer.addStringProperty("fin");
        customer.addStringProperty("email");
        customer.addStringProperty("contact_name");
        customer.addStringProperty("mobile_phone");
        customer.addStringProperty("phone");
        customer.addStringProperty("address1");
        customer.addStringProperty("address2");
        customer.addStringProperty("address3");
        customer.addStringProperty("location");

        Entity product = schema.addEntity("Product");
        product.addIdProperty();
        product.addStringProperty("name");
        product.addStringProperty("description");
        product.addFloatProperty("standard_price");
        product.addFloatProperty("vat_tax");


        try {
            new DaoGenerator().generateAll(schema, ".");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
