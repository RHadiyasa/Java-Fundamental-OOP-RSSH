package com.rrsh.oop.crud;

public class Sneakers {
    private String name;
    private String brand;
    private Integer price;
    private Integer qty;

    public Sneakers(String name, String brand, Integer price, Integer qty) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String displayInfo() {
        return "Sneakers{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
