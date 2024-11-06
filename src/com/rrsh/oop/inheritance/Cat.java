package com.rrsh.oop.inheritance;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    // Overriding
    public void eat(){
        System.out.println("cat is eating...");
    }

    public void run(){
        System.out.println("Cat is running...");
    }
}
