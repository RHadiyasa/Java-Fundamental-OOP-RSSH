package com.rrsh.oop.mobile_legends.characters.monster;

import com.rrsh.oop.mobile_legends.characters.CharacterHero;

public abstract class Monster extends CharacterHero {
    public Monster(String name, Integer hp, Integer damage) {
        super(name, hp, damage);
    }

    public abstract void minutes();
}
