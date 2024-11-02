package com.rssh.oop.inheritance;

public class Plane extends Vehicle{
    private String name;
    public Plane(String fuel, String transmission, boolean isElectric) {
        super(fuel, transmission, isElectric);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
