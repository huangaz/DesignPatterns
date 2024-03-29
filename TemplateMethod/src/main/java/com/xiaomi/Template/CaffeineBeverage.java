package com.xiaomi.Template;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public final void boilWater() {
        System.out.println("Boiling water");
    }

    public final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantCondiments() {
        return true;
    }
}
