package com.xiaomi.duck;

import com.xiaomi.fly.FlyBehavior;
import com.xiaomi.quack.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("swim");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
