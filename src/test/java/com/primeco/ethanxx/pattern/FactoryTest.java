package com.primeco.ethanxx.pattern;

import com.primeco.ethanxx.pattern.factory.method.Pizza;
import com.primeco.ethanxx.pattern.factory.method.PizzaStore;
import com.primeco.ethanxx.pattern.factory.method.impl.ChicagoPizzaStore;
import com.primeco.ethanxx.pattern.factory.method.impl.NYPizzaStore;
import junit.framework.TestCase;

/**
 * Created by ethan on 01/05/2017.
 * 工厂方法测试
 */
public class FactoryTest extends TestCase {
    public void testFactoryMethod() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
