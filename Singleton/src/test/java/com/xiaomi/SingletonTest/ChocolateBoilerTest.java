package com.xiaomi.SingletonTest;

import com.xiaomi.Singleton.ChocolateBoiler;

public class ChocolateBoilerTest {
    public static void main(String[] args) {
        ChocolateBoiler c = ChocolateBoiler.getInstance();
        c.fill();
        c.boil();
        c.drain();
    }
}
