package com.accioma.telecosfacturamovil.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcelomora on 10/17/15.
 */
public class TaxDAO {
    public static List<Tax> readAll(){
        List<Tax> taxes = new ArrayList<Tax>();
        taxes.add(new Tax(1, "IVA 12%", 12));
        return taxes;
    }
}
