package com.rrsh.oop.mobile_legends.characters.hero;

import com.rrsh.oop.mobile_legends.characters.CharacterHero;

public abstract class Hero extends CharacterHero {
    /**
     * Abstract -> bisa punya method biasa
     * hanya bisa implement 1 abstract class
     *
     * Interface -> Sudah pasti abstract, method harus abstract
     * bisa implementasi beberapa interface
     * */
    private String role;

    public Hero(String name, Integer hp, Integer damage) {
        super(name, hp, damage);
    }

    protected abstract void passive();
}
