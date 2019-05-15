package com.xiaomi.duckTest;

import com.xiaomi.duck.*;
import com.xiaomi.fly.FlyRocketPowered;

public class duckTest {
    public static void main(String[] args) {
        Duck d1 = new MallardDuck();
        Duck d2 = new RedheadDuck();

        d1.display();
        d1.swim();
        d1.performFly();
        d1.performQuack();

        System.out.println();

        d2.display();
        d2.swim();
        d2.performFly();
        d2.performQuack();

        System.out.println();

        Duck d3 = new ModelDuck();
        d3.performFly();
        d3.setFlyBehavior(new FlyRocketPowered());
        d3.performFly();
    }
}
