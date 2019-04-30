package com.xiaomi.PizzaTest;

import com.xiaomi.pizza.NYPizzaStore;
import com.xiaomi.pizza.Pizza;
import com.xiaomi.pizza.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza p1 = nyPizzaStore.orderPizza("cheese");

        System.out.print(p1.getName());
    }
}
