package com.rssh.oop.inheritance;

public class VehicleApp {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla","Bensin","Automatic",false);
        Plane airbus = new Plane("Avtur","Automatic",false);
        System.out.println(airbus);
        airbus.setName("Airbus A230");
        System.out.println(airbus + " " + airbus.getName());
        System.out.println(tesla);
    }
}
