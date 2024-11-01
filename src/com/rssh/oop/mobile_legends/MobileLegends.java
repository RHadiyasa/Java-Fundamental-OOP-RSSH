package com.rssh.oop.mobile_legends;

public class MobileLegends {
    public static void main(String[] args) {
        /*
        * Ada hero
        * 1. Marksman
        * 2. Mage
        * 3. Fighter
        * 4. Tank
        *
        * Ada monster
        * 1. Creep
        * 2. Lord
        * 3. Turtle
        * 4. Jungle
        * */

        Marksman miya = new Marksman("Miya",1500, 500);
        Marksman layla = new Marksman("Layla",1500, 400);
        Monster turtle = new Monster("Turtle", 5000, 100);

        miya.attack(turtle);
        System.out.println("-".repeat(30));
        turtle.attack(miya);
        System.out.println("-".repeat(30));
        layla.attack(turtle);

    }
}
