package com.primeco.ethanxx.pattern.decorate.impl;

import com.primeco.ethanxx.pattern.decorate.Beverage;
import com.primeco.ethanxx.pattern.decorate.CondimentDecorator;

/**
 * Created by ethan on 30/04/2017.
 * 豆浆
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
