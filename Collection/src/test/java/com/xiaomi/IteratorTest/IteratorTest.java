package com.xiaomi.IteratorTest;

import com.xiaomi.Iterator.*;

import java.util.ArrayList;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        menus.add(pancakeHouseMenu);

        DinerMenu dinerMenu = new DinerMenu();
        menus.add(dinerMenu);

        CafeMenu cafeMenu = new CafeMenu();
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
