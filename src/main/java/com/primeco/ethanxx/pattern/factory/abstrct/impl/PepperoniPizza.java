package com.primeco.ethanxx.pattern.factory.abstrct.impl;

import com.primeco.ethanxx.pattern.factory.abstrct.Pizza;
import com.primeco.ethanxx.pattern.factory.abstrct.PizzaIngredientFactory;

/**
 * Created by ethan on 01/05/2017.
 * 意大利辣香肠披萨
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
    }
}
