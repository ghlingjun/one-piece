package com.primeco.ethanxx.pattern.factory.abstrct;

/**
 * Created by ethan on 01/05/2017.
 * 生产原料工厂接口
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
