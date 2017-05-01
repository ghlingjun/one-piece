package com.primeco.ethanxx.pattern.factory.abstrct.impl;

import com.primeco.ethanxx.pattern.factory.abstrct.*;

/**
 * Created by ethan on 01/05/2017.
 * 纽约原料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
