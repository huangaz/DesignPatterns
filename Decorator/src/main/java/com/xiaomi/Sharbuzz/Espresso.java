package com.xiaomi.Sharbuzz;

public class Espresso extends Beverage {
    public Espresso() {
        super.SetDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
