package com.xiaomi.CompositeTest;

import com.xiaomi.Composite.Menu;
import com.xiaomi.Composite.MenuComponent;
import com.xiaomi.Composite.MenuItem;
import com.xiaomi.Composite.Waitress;

public class CompositeTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu  = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menu combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancake with scrambled eggs, ans toast",
                true,
                2.99
        ));

        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancake with fried eggs, sausage",
                false,
                3.49
        ));

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce",
                true,
                3.89
        ));

        dinerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "Bacon with lettuce & tomato on whole wheat",
                true,
                2.99
        ));

        // add dessert
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a falkey crust",
                true,
                1.59
        ));

        cafeMenu.add(new MenuItem(
                "Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99
        ));

        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69
        ));

        Waitress waitress = new Waitress(allMenus);

        waitress.printVegetarianMenu();
    }
}
