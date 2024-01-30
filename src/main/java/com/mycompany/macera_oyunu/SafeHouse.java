/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.macera_oyunu;

/**
 *
 * @author zafer
 */
public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    public boolean getLocation() {
        player.setHealthy(player.getrHealthy());
        System.out.println("Canınınz tekrar dolduruldu");
        System.out.println("Şu an güvenli evdesiniz");
        return true;

    }

}
