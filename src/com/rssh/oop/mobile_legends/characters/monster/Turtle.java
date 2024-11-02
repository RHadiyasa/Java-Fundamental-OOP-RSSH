package com.rssh.oop.mobile_legends.characters.monster;

import com.rssh.oop.mobile_legends.characters.Character;

public class Turtle extends Monster {
    public Turtle(String name, Integer hp, Integer damage) {
        super(name, hp, damage);
    }

    @Override
    public void minutes() {
        System.out.println("Menit awal");
    }

    @Override
    public void attack(Character target) {
        System.out.println(super.getName() + " attack");
        target.getAttacked(super.getDamage());
    }
}
