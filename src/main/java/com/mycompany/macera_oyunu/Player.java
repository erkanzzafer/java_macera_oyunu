/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.macera_oyunu;

import java.util.Scanner;

/**
 *
 * @author zafer
 */
public class Player {

    private int damage, healthy, money;
    private String name, cName;
    private Inventory inv;
    Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        switch (charMenu()) {
            case 1 -> {
                setName("Samuray");
                setDamage(5);
                setHealthy(21);
                setMoney(15);
                break;
            }
            case 2 -> {
                setName("Okçu");
                setDamage(7);
                setHealthy(18);
                setMoney(20);
                break;
            }

            case 3 -> {
                setName("Şovalye");
                setDamage(8);
                setHealthy(24);
                setMoney(5);
                break;
            }
            default -> {
                setName("Şovalye");
                setDamage(8);
                setHealthy(24);
                setMoney(5);
                break;
            }
        }

        System.out.println("Seçilen karakter: " + getName() + " Hasar: " + getDamage() + " Sağlık: " + getHealthy() + "\t Para:" + getMoney());
    }

    public int charMenu() {
        System.out.println("Lütfen bir karakter seçiniz");
        System.out.println("1- Samuray, \t Hasar : 5, Sağlık: 21, Para:15");
        System.out.println("2- Okçu, \t Hasar : 7, Sağlık: 18, Para:20");
        System.out.println("3- Şovalye, \t Hasar : 8, Sağlık: 24, Para:5");
        System.out.println("Seçiminiz");
        int charID = scan.nextInt();
        while (charID < 1 || charID > 3) {
            System.out.println("Seçiminiz");
        }
        return charID;

    }

    public int getDamage() {
        return damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getcName() {
        return cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

}
