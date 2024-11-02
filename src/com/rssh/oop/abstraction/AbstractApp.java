package com.rssh.oop.abstraction;

public class AbstractApp {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0); // polymorph
        Shape circle = new Circle(10);
        System.out.println("Keliling: " + rectangle.getKeliling());
        System.out.println("Luas: " + rectangle.getArea());

        System.out.println("Area: " + circle.getArea());
        System.out.println("Keliling: " + circle.getKeliling());
    }
}
