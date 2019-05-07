package com.xiaomi.ProxyTest;

import com.xiaomi.Proxy.GumballMachineRemote;
import com.xiaomi.Proxy.GumballMonitor;

import java.rmi.Naming;

public class MonitorTest {
    public static void main(String[] args) {
        String location = "rmi://localhost/gumballmachine";

        GumballMonitor monitor;

        try {
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location);
            monitor = new GumballMonitor(machine);
            System.out.println(monitor);
            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
