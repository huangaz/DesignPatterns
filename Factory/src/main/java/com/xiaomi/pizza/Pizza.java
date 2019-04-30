package com.xiaomi.pizza;

import java.util.ArrayList;

public abstract class Pizza {

    private String name;
    private String dough;
    private String sause;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
    }

    public void bake() {
        System.out.println("Bake for 20 min.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSause(String sause) {
        this.sause = sause;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
}
