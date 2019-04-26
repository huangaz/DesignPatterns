package com.xiaomi.duck;

import com.xiaomi.fly.FlyWithWings;
import com.xiaomi.quack.Squeak;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super.setQuackBehavior(new Squeak());
        super.setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("read head");
    }
}
