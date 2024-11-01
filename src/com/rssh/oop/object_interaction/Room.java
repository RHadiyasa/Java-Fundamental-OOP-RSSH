package com.rssh.oop.object_interaction;

public class Room {
    private Lamp roomLamp;

    public Room(Lamp roomLamp){
        this.roomLamp = roomLamp;
    }

    public void switchLamp(){
        if (roomLamp.getCondition().equals("On")){
            roomLamp.turnOff();
        } else {
            roomLamp.turnOn();
        }
    }

    public void getLampCondition(){
        System.out.println("Condition: " + roomLamp.getCondition());
    }
}
