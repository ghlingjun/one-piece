package com.primeco.ethanxx.pattern.strategy.impl;

import com.primeco.ethanxx.pattern.strategy.FlyBehavior;

/**
 * Created by ethan on 29/04/2017.
 * 使用翅膀飞
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
