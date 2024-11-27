package com.rrsh.oop.mobile_legends.characters.monster;

import com.rrsh.oop.mobile_legends.characters.CharacterHero;

public class Turtle extends Monster {
    public Turtle(String name, Integer hp, Integer damage) {
        super(name, hp, damage);
    }

    @Override
    public void minutes() {
        System.out.println("Menit awal");
    }

    @Override
    public void attack(CharacterHero target) {
        System.out.println(super.getName() + " attack");
        target.getAttacked(super.getDamage());
    }
}
