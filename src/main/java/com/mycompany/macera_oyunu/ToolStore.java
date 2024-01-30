/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.macera_oyunu;

/**
 *
 * @author zafer
 */
public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean getLocation() {
        System.out.println("Para: " + player.getMoney());
        System.out.println("1 Silahlar");
        System.out.println("2 Zırhlar");
        System.out.println("3 Çıkış");
        System.out.println("Seçiminiz: ");
        int selTool = scan.nextInt();
        int selItemID;
        switch (selTool) {
            case 1 -> {
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            }
            default ->
                throw new AssertionError();
        }
        return true;
    }

    public int weaponMenu() {
        System.out.println("1. Tabanca\t <Para: 25 - Hasar: 2>");
        System.out.println("2. Kılıç\t <Para: 35 - Hasar: 3>");
        System.out.println("3. Tüfek <Para: 45 - Hasar: 7>");
        System.out.println("4. Çıkış");
        System.out.println("Silah Seçiniz: ");
        int selWeaponID = scan.nextInt();
        return selWeaponID;
    }

    public void buyWeapon(int itemID) {
        int damage = 0, price = 0;
        String wName = null;

        switch (itemID) {
            case 1 -> {
                damage = 2;
                wName = "Tabanca";
                price = 5;
                break;
            }
            case 2 -> {
                damage = 3;
                wName = "Kılıç";
                price = 35;
                break;
            }
            case 3 -> {
                damage = 7;
                wName = "Tüfek";
                price = 45;
                break;
            }
            default -> {
                System.out.println("Geçersiz işlem");
                break;
            }
        }

        if (player.getMoney() > price) {
            player.getInv().setDamage(damage);
            player.getInv().setwName(wName);
            player.setMoney(player.getMoney() - price);
            System.out.println(wName + " satın aldınız, Önceki hasar: " + player.getDamage()
                    + ", Yeni hasar" + (player.getDamage() + player.getInv().getDamage()));
            System.out.println("Kalan para: " + player.getMoney());
        } else {
            System.out.println("Bakiye yetersiz, Bakiyeniz:" + player.getMoney());
        }

    }

}
