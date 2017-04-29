package com.primeco.ethanxx.pattern.strategy.impl;

import com.primeco.ethanxx.pattern.strategy.FlyBehavior;

/**
 * Created by ethan on 29/04/2017.
 * 火箭动力飞行
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
