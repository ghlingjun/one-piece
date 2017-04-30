package com.primeco.ethanxx.pattern.decorate;

/**
 * Created by ethan on 30/04/2017.
 * 饮料基类
 */
public abstract class Beverage {
    private String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

}
