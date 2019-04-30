package com.xiaomi.pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("clam")) {
            return new NYClamPizza();
        } else {
            return null;
        }
    }
}
