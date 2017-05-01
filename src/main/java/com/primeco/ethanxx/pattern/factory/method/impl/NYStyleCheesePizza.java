package com.primeco.ethanxx.pattern.factory.method.impl;

import com.primeco.ethanxx.pattern.factory.method.Pizza;

import java.util.ArrayList;

/**
 * Created by ethan on 01/05/2017.
 * 纽约风味芝士披萨
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        setName("NY Style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");

        ArrayList<String> toppings = getToppings();
        toppings.add("Grated Reggiano Cheese");
        setToppings(toppings);
    }
}
