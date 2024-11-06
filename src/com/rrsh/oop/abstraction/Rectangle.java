package com.rrsh.oop.abstraction;

public class Rectangle extends Shape {
    private Double side;

    public Rectangle(Double side) {
        this.side = side;
    }

    @Override
    public Double getKeliling() {
        return side * 4;
    }

    @Override
    public Double getArea() {
        return side * side;
    }
}
