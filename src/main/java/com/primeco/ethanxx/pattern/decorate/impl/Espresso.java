package com.primeco.ethanxx.pattern.decorate.impl;

import com.primeco.ethanxx.pattern.decorate.Beverage;

/**
 * Created by ethan on 30/04/2017.
 * 浓咖啡
 */
public class Espresso extends Beverage {
    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
