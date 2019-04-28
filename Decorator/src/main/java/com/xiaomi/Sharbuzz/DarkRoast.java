package com.xiaomi.Sharbuzz;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super.SetDescription("DarkRoast");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
