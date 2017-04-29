package com.primeco.ethanxx.pattern.strategy.impl;

import com.primeco.ethanxx.pattern.strategy.Duck;

/**
 * Created by ethan on 29/04/2017.
 * 模型鸭
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
