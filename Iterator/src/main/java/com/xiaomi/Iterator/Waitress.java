package com.xiaomi.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    private ArrayList<Menu> menus;
    // private Menu pancakeHouseMenu;
    // private Menu dinerMenu;
    // private Menu cafeMenu;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> iterator = menus.iterator();

        /*
        Iterator<MenuItem> pancakeIteraror = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIteraror);

        System.out.println("\nLUNCH");
        printMenu(dinerIterator);

        System.out.println("\nDINNER");
        printMenu(cafeIterator);
        */

        while (iterator.hasNext()) {
            Menu menu = iterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
        System.out.println();
    }
}
