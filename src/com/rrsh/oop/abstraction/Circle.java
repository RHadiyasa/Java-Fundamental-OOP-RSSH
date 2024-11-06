package com.rrsh.oop.abstraction;

public class Circle extends Shape {
    private Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    @Override
    public Double getKeliling() {
        return 2 * super.PI * radius;
    }

    @Override
    public Double getArea() {
        return super.PI * radius * radius;
    }
}
