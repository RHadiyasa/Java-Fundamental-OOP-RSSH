package com.rrsh.oop.interfaceExample;

public class InterfaceApp {
    public static void main(String[] args) {
        Phone smartPhone = new PhoneImpl("Samsung");
        UserPhone rafi = new UserPhone("Rafi", smartPhone);

        rafi.turnOffPhone();
        rafi.turnOnPhone();
        rafi.userDevice();

//        smartPhone.turnOff();
//        smartPhone.turnOn();
//        smartPhone.turnOff();
//        smartPhone.infoDevice();
    }
}
