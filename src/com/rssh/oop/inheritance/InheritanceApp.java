package com.rssh.oop.inheritance;

public class InheritanceApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Hewan");
        Cat oyen = new Cat("Oyen");
        Persia persia = new Persia("Persia Oren");
        oyen.eat();
        persia.sleep();
        persia.run();

        System.out.println(persia.getName());
    }
}
