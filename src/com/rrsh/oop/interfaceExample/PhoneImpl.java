package com.rrsh.oop.interfaceExample;

public class PhoneImpl implements Phone, Android{
    private String brand;
    private boolean power = true;

    public PhoneImpl(String brand) {
        this.brand = brand;
    }

    @Override
    public void turnOn() {
        this.power = true;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void turnOff() {
        this.power = false;
    }

    @Override
    public void infoDevice(){
        if (this.power){
            System.out.println(this.brand + " is On");
        } else {
            System.out.println(this.brand + " is Off");
        }
    }
}
