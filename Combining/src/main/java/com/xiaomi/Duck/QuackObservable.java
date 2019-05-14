package com.xiaomi.Duck;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
