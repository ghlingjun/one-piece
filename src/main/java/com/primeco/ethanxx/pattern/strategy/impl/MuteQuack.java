package com.primeco.ethanxx.pattern.strategy.impl;

import com.primeco.ethanxx.pattern.strategy.QuackBehavior;

/**
 * Created by ethan on 29/04/2017.
 * 不会叫的鸭子
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
