package com.xiaomi.Singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill chocolate and milk
            System.out.println("fill...");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain chocolate
            empty = true;
            System.out.println("drain...");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // boil
            boiled = true;
            System.out.println("boil...");
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
