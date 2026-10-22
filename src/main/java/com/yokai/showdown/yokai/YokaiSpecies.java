package com.yokai.showdown.yokai;

public class YokaiSpecies {
    private String name;
    private String tribe;
    private char rank;

    public YokaiSpecies(
        String name,
        String tribe,
        char rank,
        int baseHP,
        int baseStrength,
        int baseSpirit,
        int baseDefense,
        int baseSpeed,
        int maxLevelHP,
        int maxLevelStrength,
        int maxLevelSpirit,
        int maxLevelDefense,
        int maxLevelSpeed) {

    this.name = name;
    this.tribe = tribe;
    this.rank = rank;

    this.baseHP = baseHP;
    this.baseStrength = baseStrength;
    this.baseSpirit = baseSpirit;
    this.baseDefense = baseDefense;
    this.baseSpeed = baseSpeed;

    this.maxLevelHP = maxLevelHP;
    this.maxLevelStrength = maxLevelStrength;
    this.maxLevelSpirit = maxLevelSpirit;
    this.maxLevelDefense = maxLevelDefense;
    this.maxLevelSpeed = maxLevelSpeed;
}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTribe() {
        return this.tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public char getRank() {
        return this.rank;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }
    
    // Level 1 base stats
    private int baseHP;
    private int baseStrength;
    private int baseSpirit;
    private int baseDefense;
    private int baseSpeed;

    public int getBaseHP() {
        return this.baseHP;
    }

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public int getBaseStrength() {
        return this.baseStrength;
    }

    public void setBaseStrength(int baseStrength) {
        this.baseStrength = baseStrength;
    }

    public int getBaseSpirit() {
        return this.baseSpirit;
    }

    public void setBaseSpirit(int baseSpirit) {
        this.baseSpirit = baseSpirit;
    }

    public int getBaseDefense() {
        return this.baseDefense;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public int getBaseSpeed() {
        return this.baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    // Level 99 base stats
    private int maxLevelHP;
    private int maxLevelStrength;
    private int maxLevelSpirit;
    private int maxLevelDefense;
    private int maxLevelSpeed;

    public int getMaxLevelHP() {
        return this.maxLevelHP;
    }

    public void setMaxLevelHP(int maxLevelHP) {
        this.maxLevelHP = maxLevelHP;
    }

    public int getMaxLevelStrength() {
        return this.maxLevelStrength;
    }

    public void setMaxLevelStrength(int maxLevelStrength) {
        this.maxLevelStrength = maxLevelStrength;
    }

    public int getMaxLevelSpirit() {
        return this.maxLevelSpirit;
    }

    public void setMaxLevelSpirit(int maxLevelSpirit) {
        this.maxLevelSpirit = maxLevelSpirit;
    }

    public int getMaxLevelDefense() {
        return this.maxLevelDefense;
    }

    public void setMaxLevelDefense(int maxLevelDefense) {
        this.maxLevelDefense = maxLevelDefense;
    }

    public int getMaxLevelSpeed() {
        return this.maxLevelSpeed;
    }

    public void setMaxLevelSpeed(int maxLevelSpeed) {
        this.maxLevelSpeed = maxLevelSpeed;
    }

}

