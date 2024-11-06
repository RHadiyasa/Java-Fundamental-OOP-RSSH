package com.rrsh.oop.interfaceExample;

public class UserPhone {
    private String name;
    private Phone phone;

    public UserPhone(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public void turnOnPhone(){
        phone.turnOn();
    }

    public void turnOffPhone(){
        phone.turnOff();
    }

    public void userDevice(){
        System.out.println("User: " + this.name);
        System.out.println("User Device: " + phone.getBrand());
        phone.infoDevice();
    }
}
