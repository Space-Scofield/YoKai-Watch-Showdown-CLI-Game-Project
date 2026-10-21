package com.yokai.showdown.yokai;

public class YokaiStats {
    private int hp;
    private int strength;
    private int defense;
    private int spirit;
    private int speed;

    public YokaiStats(int hpYokai, int strengthYokai, int defenseYokai, int spiritYokai, int speedYokai){
        this.hp = hpYokai;
        this.strength = strengthYokai;
        this.defense = defenseYokai;
        this.spirit = spiritYokai;
        this.speed = speedYokai;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpirit() {
        return this.spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
