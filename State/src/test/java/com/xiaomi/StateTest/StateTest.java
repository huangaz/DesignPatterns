package com.xiaomi.StateTest;

import com.xiaomi.State.GumballMachine;

public class StateTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();

        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
    }
}
