package com.primeco.ethanxx.pattern.factory.abstrct.impl;

import com.primeco.ethanxx.pattern.factory.abstrct.Pizza;
import com.primeco.ethanxx.pattern.factory.abstrct.PizzaIngredientFactory;
import com.primeco.ethanxx.pattern.factory.abstrct.PizzaStore;

/**
 * Created by ethan on 01/05/2017.
 * 芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }
}
