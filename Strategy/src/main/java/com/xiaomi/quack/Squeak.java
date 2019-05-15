package com.xiaomi.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
