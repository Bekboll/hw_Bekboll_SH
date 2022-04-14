package com.company;

public class Boss extends GameEntity {

    Weapon weaponName = new Weapon();
    Weapon weaponGun = new Weapon();


    public Boss(int health, int damage, String power) {
        super(health, damage, power);
    }

    protected String printInfo() {
        return toString();
    }
}
