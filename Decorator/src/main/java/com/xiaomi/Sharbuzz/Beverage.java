package com.xiaomi.Sharbuzz;

public abstract class Beverage {

    private String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void SetDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
