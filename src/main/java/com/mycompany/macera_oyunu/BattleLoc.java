/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.macera_oyunu;

/**
 *
 * @author zafer
 */
public abstract class BattleLoc extends Location {

    Obstacle obstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
    }

    public boolean getLocation() {
        
        return true;
    }

}
