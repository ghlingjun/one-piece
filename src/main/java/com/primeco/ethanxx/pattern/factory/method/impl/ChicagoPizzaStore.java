package com.primeco.ethanxx.pattern.factory.method.impl;

import com.primeco.ethanxx.pattern.factory.method.Pizza;
import com.primeco.ethanxx.pattern.factory.method.PizzaStore;

/**
 * Created by ethan on 01/05/2017.
 * 纽约披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (("cheese").equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
