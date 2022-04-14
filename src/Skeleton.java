package com.company;

public class Skeleton extends com.company.Boss {
    private String firstShot;

    public Skeleton(int health, int damage, String power) {
        super(health, damage, power);
    }


    public String printInfo() {

        System.out.println(getFirstShot() + "hp" + getHealth() + " uron" + getDamage() + " sposobnost-" + getPower() +
                " называния-" + weaponName.getWeaponName() + "\n огнистрелная-" + weaponGun.getWeaponGun());
        return super.printInfo() + "\n Кол-во стрел:" + getFirstShot();
    }


    public String getFirstShot() {
        return firstShot;
    }

    public void setFirstShot(String firstShot) {
        this.firstShot = firstShot;
    }
}