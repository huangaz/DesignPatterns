package com.xiaomi.DuckTest;

import com.xiaomi.Duck.AbstractDuckFactory;
import com.xiaomi.Duck.CountingDuckFactory;
import com.xiaomi.Duck.DuckSimulator;

public class DuckTest {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }
}
