package com.primeco.ethanxx.pattern.decorate.impl;

import com.primeco.ethanxx.pattern.decorate.Beverage;
import com.primeco.ethanxx.pattern.decorate.CondimentDecorator;

/**
 * Created by ethan on 30/04/2017.
 * 耐泡
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
