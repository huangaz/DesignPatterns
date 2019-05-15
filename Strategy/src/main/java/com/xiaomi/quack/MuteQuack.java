package com.xiaomi.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("can't quack");
    }
}
