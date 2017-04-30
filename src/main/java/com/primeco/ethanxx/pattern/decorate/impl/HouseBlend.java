package com.primeco.ethanxx.pattern.decorate.impl;

import com.primeco.ethanxx.pattern.decorate.Beverage;

/**
 * Created by ethan on 30/04/2017.
 * House Blend Coffe
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
