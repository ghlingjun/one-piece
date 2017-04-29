package com.primeco.ethanxx.pattern.strategy.impl;

import com.primeco.ethanxx.pattern.strategy.QuackBehavior;

/**
 * Created by ethan on 29/04/2017.
 * 吱吱叫的鸭子
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
