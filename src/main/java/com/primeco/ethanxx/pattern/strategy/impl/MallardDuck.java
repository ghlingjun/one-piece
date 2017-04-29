package com.primeco.ethanxx.pattern.strategy.impl;

import com.primeco.ethanxx.pattern.strategy.Duck;

/**
 * Created by ethan on 29/04/2017.
 * 绿头鸭实现类
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

