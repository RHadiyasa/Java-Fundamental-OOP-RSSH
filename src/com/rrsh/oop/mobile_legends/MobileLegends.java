package com.rrsh.oop.mobile_legends;

import com.rrsh.oop.mobile_legends.characters.hero.Marksman;
import com.rrsh.oop.mobile_legends.characters.monster.Turtle;

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
        *
        * */

        Marksman miya = new Marksman("Miya",1500, 1500);
        Marksman layla = new Marksman("Layla",1500, 400);
        Turtle turtle = new Turtle("Turtle Menit 5", 2000, 200);

        miya.attack(turtle);
        System.out.println("Hp Miya: " + miya.getHp());
        System.out.println("-".repeat(30));
        turtle.attack(miya);
        System.out.println("-".repeat(30));
        layla.attack(turtle);

        miya.attack(turtle);
        System.out.println("Hp Miya: " + miya.getHp());
    }
}
