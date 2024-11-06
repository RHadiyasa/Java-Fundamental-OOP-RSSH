package com.rrsh.oop.abstraction;

public class BlockChild extends Block {
    private Double length;
    private Double width;
    private Double height;

    public BlockChild(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getVolume() {
        return length * height * width;
    }

    @Override
    public Double getKeliling() {
        return (4 * length) + (4 * width) + (4 * height);
    }

    @Override
    public Double getArea() {
        return 2 * (length * width) + 2 * (length * height) + 2 * (height * width);
    }
}
