package com.xiaomi.duck;

import com.xiaomi.fly.FlyNoWay;
import com.xiaomi.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.setFlyBehavior(new FlyNoWay());
        super.setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("model duck");
    }
}
