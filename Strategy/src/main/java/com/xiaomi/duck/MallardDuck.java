package com.xiaomi.duck;

import com.xiaomi.fly.FlyWithWings;
import com.xiaomi.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.setQuackBehavior(new Quack());
        super.setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("green head");
    }
}
