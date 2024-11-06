package com.rrsh.oop.object_interaction;

public class LampApp {
    public static void main(String[] args) {
        /**
        Lamp lamp = new Lamp();
        System.out.println(lamp.getCondition());
        lamp.turnOn();
        System.out.println(lamp.getCondition());
         */

        Room room = new Room(new Lamp());

        room.getLampCondition();
        room.switchLamp();
        room.getLampCondition();
        room.switchLamp();
        room.getLampCondition();
    }
}
