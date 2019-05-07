package com.xiaomi.ProxyTest;

import com.xiaomi.Proxy.GumballMachine;
import com.xiaomi.Proxy.GumballMachineRemote;

import java.rmi.Naming;

public class ProxyTest {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine;
        int count = 100;
        String location = "localhost";

        try {
            gumballMachine = new GumballMachine(count, location);
            Naming.rebind("//" + location + "gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
