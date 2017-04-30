package com.primeco.ethanxx.pattern.observer;

/**
 * Created by ethan on 30/04/2017.
 * 主体
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
