package com.accioma.telecosfacturamovil.model;

import java.io.Serializable;

/**
 * Created by marcelomora on 10/14/15.
 */
public class Tax implements Serializable{
    private long id;
    private String name;
    private float percent;

    public Tax(long id, String name, float percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }
}
