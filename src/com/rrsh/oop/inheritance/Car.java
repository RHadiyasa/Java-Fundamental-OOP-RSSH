package com.rrsh.oop.inheritance;

public class Car extends Vehicle {
    String name;

    // overloading
    Car(String fuel, String transmission, boolean isElectric){
        super(fuel, transmission, isElectric);
    }

    Car(String name, String fuel, String transmission, boolean isElectric){
        super(fuel, transmission, isElectric);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}' + super.toString();
    }
}
