package com.rrsh.oop.mobile_legends.characters;

public abstract class CharacterHero {
    private String name;
    private Integer hp;
    private Integer damage;

    public CharacterHero(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    // abstract
    public abstract void attack(CharacterHero target);

    // Method attack
    //    public void attack(Monster monster){
    //        System.out.println(this.name + " attack");
    //        monster.getAttacked(this.damage);
    //    }
    //
    //    public void attack(Hero hero){
    //        System.out.println(this.name + " attack");
    //        hero.getAttacked(this.damage);
    //    }

    // Method getAttacked
    public void getAttacked(Integer damage){
        System.out.println(this.name + " got attacked " + damage);
        this.hp -= damage;
        System.out.println("HP after: " + this.hp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}
