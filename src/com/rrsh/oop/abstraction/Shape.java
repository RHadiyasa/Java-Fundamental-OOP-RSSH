package com.rrsh.oop.abstraction;

public abstract class Shape {
    final double PI = 3.14; // final -> constant / js -> const

    // Defensive programming
    public abstract Double getKeliling();
    public abstract Double getArea();

}
