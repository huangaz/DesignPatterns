package com.xiaomi.pizza;

public abstract class PizzaStore {

    //private SimplePizzaFactory factory;

    public PizzaStore() {
    }

    public final Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
