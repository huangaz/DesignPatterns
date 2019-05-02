package com.xiaomi.DuckTest;

import com.xiaomi.Duck.Duck;

import java.util.Arrays;

public class DuckTest {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("Before sorting:");
        disPlay(ducks);

        Arrays.sort(ducks);
        System.out.println();

        System.out.println("After sorting:");
        disPlay(ducks);
    }

    public static void disPlay(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i].toString());
        }
    }
}
