package com.xiaomi.TemplateTest;

import com.xiaomi.Template.Coffee;
import com.xiaomi.Template.Tea;

public class TemplateTest {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        Coffee myCoffee = new Coffee();

        System.out.println("Making tea...");
        myTea.prepareRecipe();

        System.out.println("Making coffee...");
        myCoffee.prepareRecipe();
    }
}
