package com.accioma.telecosfacturamovil.db;

import com.accioma.telecosfacturamovil.model.Tax;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcelomora on 10/14/15.
 */
public class TaxLineDAO implements Serializable{
    public static List<Tax> readAll(){
        List<Tax> taxes = new ArrayList<Tax>();
        taxes.add(new Tax(1, "IVA 12%", 12F));
        taxes.add(new Tax(2, "IVA 0%", 0F));
        return taxes;

    }
}
