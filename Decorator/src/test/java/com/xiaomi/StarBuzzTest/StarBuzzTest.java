package com.xiaomi.StarBuzzTest;

import com.xiaomi.Sharbuzz.*;

public class StarBuzzTest {
    public static void main(String[] Args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        System.out.println();

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
