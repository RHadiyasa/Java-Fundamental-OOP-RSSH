package com.rssh.oop.inheritance;

// Parent class
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println("Animal is sleeping...");
    }

    public void eat(){
        System.out.println("Animal is eating...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
