package com.rssh.oop.encapsulation;

public class CarApp {
    public static void main(String[] args) {
        /**
         * 1. Encapsulation
         * 2. Inheritance
         * 3. Abstraction
         * 4. Polymorph
         * */

        Car yaris = new Car("Yaris","Toyota",4); // membuat object bernama yaris
        Car avanza = new Car(); // gak error karena ada overloading constructor
        Car bmw = new Car("320i","BWM",4);

        System.out.println(bmw);
        System.out.println(yaris);

        System.out.println(yaris.getName());
        yaris.setName("Kijang");
        System.out.println(yaris.getName());

    }
}
