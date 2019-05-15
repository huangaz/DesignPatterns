package com.xiaomi.Iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "Bacon with lettuce & tomato on whole wheat",
                true,
                2.99);

        addItem("Soup of the day",
                "Soup of the day, with a side of  patato salad",
                false,
                3.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else  {
            menuItems[numberOfItems] = menuItem;
            numberOfItems+=1;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
