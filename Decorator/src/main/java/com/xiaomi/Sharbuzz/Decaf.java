package com.xiaomi.Sharbuzz;

public class Decaf extends Beverage {
    public Decaf() {
        super.SetDescription("Decaf");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
