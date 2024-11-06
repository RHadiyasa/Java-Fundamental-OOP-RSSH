package com.rrsh.oop.mobile_legends.characters.hero;

import com.rrsh.oop.mobile_legends.characters.Character;

public class Marksman extends Hero {
    public Marksman(String name, Integer hp, Integer damage) {
        super(name, hp, damage);
    }

    @Override
    protected void passive() {
        Integer lifeSteal = (int) (super.getDamage() * 0.05);
        Integer currentHp = getHp();

        setHp(lifeSteal+ currentHp);
    }

    @Override
    public void attack(Character target) {
        System.out.println(super.getName() + " attack " + super.getDamage() + " damage");
        target.getAttacked(super.getDamage());
        passive();
    }

}
