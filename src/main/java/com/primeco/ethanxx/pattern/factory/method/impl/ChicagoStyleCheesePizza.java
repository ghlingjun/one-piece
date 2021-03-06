package com.primeco.ethanxx.pattern.factory.method.impl;

import com.primeco.ethanxx.pattern.factory.method.Pizza;

import java.util.ArrayList;

/**
 * Created by ethan on 01/05/2017.
 * 芝加哥风味芝士披萨
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        setName("Chicago Style Deep Dish and Cheese Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");

        ArrayList<String> toppings = getToppings();
        toppings.add("Shredded Mozzarella Cheese");
        setToppings(toppings);
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
