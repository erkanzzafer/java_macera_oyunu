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
public class Game {

    Player player;
    Location location;

    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Macera oyununa hoşgeldiniz !");
        System.out.println("Oyuna başlamadan önce isminizi giriniz : a");
       // String playerName = scan.nextLine();
        player = new Player("a");
        player.selectChar();
    }

}
