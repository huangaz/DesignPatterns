package com.xiaomi.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu() {
        addItem("K&B's Pancake Breakfast",
                "Pancake with scrambled eggs, ans toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancake with fried eggs, sausage",
                false,
                3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
