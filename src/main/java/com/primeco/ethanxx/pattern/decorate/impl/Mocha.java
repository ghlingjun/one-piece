package com.primeco.ethanxx.pattern.decorate.impl;

import com.primeco.ethanxx.pattern.decorate.Beverage;
import com.primeco.ethanxx.pattern.decorate.CondimentDecorator;

/**
 * Created by ethan on 30/04/2017.
 * 摩卡
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
