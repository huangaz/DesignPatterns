package com.xiaomi.SingletonTest;

import com.xiaomi.Singleton.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getDescription());
    }
}
