package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss(300, 50, "защита");

        boss1.weaponName.setWeaponName("ak47");
        boss1.weaponGun.setWeaponGun("стрелять");

        System.out.println("hp" + boss1.getHealth() + "uron" + boss1.getDamage() + " "
                + boss1.getPower() + " " + boss1.weaponName.getWeaponName() + " " + boss1.weaponGun.getWeaponGun());

        Boss printInfo = new Boss(300, 50, "protection");

        Skeleton skeleton = new Skeleton(300, 50, "защита ");
        skeleton.setFirstShot("two");
        skeleton.setHealth(400);
        skeleton.setDamage(50);
        skeleton.setPower("magic");
        skeleton.weaponName.setWeaponName("vintovka");
        skeleton.weaponGun.setWeaponGun("стреляет");


        System.out.println("____________________________________________________________________________");

        Skeleton skeleton1 = new Skeleton(400, 40, "защита себя ");
        skeleton1.weaponName.setWeaponName("m16");
        skeleton1.weaponGun.setWeaponGun("пять раз");
        skeleton1.setHealth(350);
        skeleton1.setDamage(30);
        skeleton1.setPower("уклонения ");
        skeleton1.setFirstShot("sem");

        System.out.println("выстрелы-" + skeleton1.weaponGun.getWeaponGun() + " называния-" + skeleton1.weaponName.getWeaponName() +
                "hp-" + skeleton1.getHealth() + " uron-" + skeleton1.getDamage() + " способность-" + skeleton1.getPower() + "выстрел-" + skeleton1.getFirstShot());

        System.out.println("______________________________________________________________________________________________________________");

        Skeleton skeleton2 = new Skeleton(200, 30, "superPower");
        skeleton2.setPower("Attack");
        skeleton2.setDamage(20);
        skeleton2.setHealth(200);
        skeleton2.setFirstShot("три раза стрелял ");
        System.out.println(skeleton2.getPower() + " " + skeleton2.getDamage() + " " + skeleton2.getHealth() + " " + skeleton2.getFirstShot());

    }

}
