package com.rssh.oop.mobile_legends.characters.monster;

import com.rssh.oop.mobile_legends.characters.Character;

public abstract class Monster extends Character {
    public Monster(String name, Integer hp, Integer damage) {
        super(name, hp, damage);
    }

    public abstract void minutes();
}
