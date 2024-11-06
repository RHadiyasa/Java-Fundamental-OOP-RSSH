package com.rrsh.oop.inheritance;

public class Persia extends Cat {
    public Persia(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getClass().getSimpleName() + " is running...");
    }
}
