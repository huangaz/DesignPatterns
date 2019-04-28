package com.xiaomi.Sharbuzz;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super.SetDescription("HouseBlend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
