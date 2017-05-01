package com.primeco.ethanxx.pattern.factory.abstrct;

/**
 * Created by ethan on 01/05/2017.
 * 披萨店
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
