package com.yokai.showdown.yokai;

public class Yokai {
    // Identity
    private int id;
    private YokaiSpecies species;
    
    // Abilities
    private Ability physicalAttack;
    private int physicalAttackMasteryLevel;
    private Ability technique;
    private int techniqueMasteryLevel;
    private Ability animaximun;
    private int animaximunMasteryLevel;
    private Ability spiritation;
    private Ability passiveAbility;

    // Global stats
    private int level;

    // Individual values
    private int ivHP;
    private int ivMaxHP;
    private int ivStrength;
    private int ivSpirit;
    private int ivDefense;
    private int ivSpeed;

    public Yokai(
        int IdYokai,
        YokaiSpecies speciesYokai,
        Ability physicalAttackYokai,
        int physicalAttackMasteryLevelYokai,
        Ability techniqueYokai,
        int techniqueMasteryLevelYokai,
        Ability animaximunYokai,
        int animaximunMasteryLevelYokai,
        Ability spiritationYokai,
        Ability passiveAbilityYokai,
        int levelYokai,
        int ivMaxHPYokai,
        int ivHPYokai,
        int ivStrengthYokai, 
        int ivSpiritYokai,
        int ivDefense,
        int ivSpeed){
            
            this.id = IdYokai;
            this.species = speciesYokai;
            
            this.physicalAttack = physicalAttackYokai;
            this.physicalAttackMasteryLevel = physicalAttackMasteryLevelYokai;

            this.technique = techniqueYokai;
            this.techniqueMasteryLevel = techniqueMasteryLevelYokai;

            this.animaximun = animaximunYokai;
            this.animaximunMasteryLevel = animaximunMasteryLevelYokai;

            this.spiritation = spiritationYokai;
            this.passiveAbility = passiveAbilityYokai;

            this.level = levelYokai;
            this.ivHP = ivHPYokai;
            this.ivMaxHP = ivMaxHPYokai;

            this.ivStrength = ivStrengthYokai;
            this.ivSpirit = ivSpiritYokai;

            this.ivDefense = ivDefense;
            this.ivSpeed = ivSpeed;
            }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public YokaiSpecies getSpecies() {
        return this.species;
    }

    public void setSpecies(YokaiSpecies species) {
        this.species = species;
    }

     public Ability getPhysicalAttack() {
        return this.physicalAttack;
    }

    public void setPhysicalAttack(Ability physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    public int getPhisicAttackMasteryLevel() {
        return this.physicalAttackMasteryLevel;
    }

    public void setPhisicAttackMasteryLevel(int phisicAttackMasteryLevel) {
        this.physicalAttackMasteryLevel = phisicAttackMasteryLevel;
    }

    public Ability getTechnique() {
        return this.technique;
    }

    public void setTechnique(Ability technique) {
        this.technique = technique;
    }

    public int getTechniqueMasteryLevel() {
        return this.techniqueMasteryLevel;
    }
    public void setTechniqueMasteryLevel(int techniqueMasteryLevel) {
        this.techniqueMasteryLevel = techniqueMasteryLevel;
    }

    public Ability getAnimaximun() {
        return this.animaximun;
    }

    public void setAnimaximun(Ability animaximun) {
        this.animaximun = animaximun;
    }

    public int getAnimaximunMasteryLevel() {
        return this.animaximunMasteryLevel;
    }

    public void setAnimaximunMasteryLevel(int animaximunMasteryLevel) {
        this.animaximunMasteryLevel = animaximunMasteryLevel;
    }

    public Ability getSpiritation() {
        return this.spiritation;
    }

    public void setSpiritation(Ability spiritation) {
        this.spiritation = spiritation;
    }

    public Ability getPassiveAbility() {
        return this.passiveAbility;
    }

    public void setPassiveAbility(Ability passiveAbility) {
        this.passiveAbility = passiveAbility;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

     public int getIvHP() {
        return this.ivHP;
    }

    public void setIvHP(int ivHP) {
        this.ivHP = ivHP;
    }

    public int getIvMaxHP() {
        return this.ivMaxHP;
    }

    public void setIvMaxHP(int ivMaxHP) {
        this.ivMaxHP = ivMaxHP;
    }

    public int getIvStrength() {
        return this.ivStrength;
    }

    public void setIvStrength(int ivStrength) {
        this.ivStrength = ivStrength;
    }

    public int getIvSpirit() {
        return this.ivSpirit;
    }

    public void setIvSpirit(int ivSpirit) {
        this.ivSpirit = ivSpirit;
    }

    public int getIvDefense() {
        return this.ivDefense;
    }

    public void setIvDefense(int ivDefense) {
        this.ivDefense = ivDefense;
    }

    public int getIvSpeed() {
        return this.ivSpeed;
    }

    public void setIvSpeed(int ivSpeed) {
        this.ivSpeed = ivSpeed;
    }
}