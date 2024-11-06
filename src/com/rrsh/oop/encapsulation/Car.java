package com.rrsh.oop.encapsulation;

public class Car {
    private String name;
    private String brand;
    private Integer wheels;


    /**
     * int
     * Integer
     * */



    public Car(String name, String brand, Integer wheels) {
        this.name = name;
        this.brand = brand;
        this.wheels = wheels;
    }

    /**
     * Tipe Data
     * 1. Primitive -> int -> alokasi memori sudah ditentukan
     * 2. Non-primitive -> String, Integer -> dinamis alokasi memorinya
     *
     * */


    // Overloading constructor
    // Overloading -> method yang sama, tapi parameternya beda.
    public Car(){

    }

    // getter name
    public String getName(){
        return name;
    }

    public void setName(String name) {
        if (!name.equals("Yaris")){
            System.out.println("Gabisa anjing");
            return;
        }
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }
}
