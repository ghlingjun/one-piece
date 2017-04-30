package com.primeco.ethanxx.pattern.observer;

/**
 * Created by ethan on 30/04/2017.
 * 观察者
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
