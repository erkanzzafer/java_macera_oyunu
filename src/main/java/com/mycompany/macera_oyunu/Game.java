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
    Scanner scan = new Scanner(System.in);

    public void login() {
        System.out.println("Macera oyununa hoşgeldiniz !");
        System.out.println("Oyuna başlamadan önce isminizi giriniz : a");
        // String playerName = scan.nextLine();
        player = new Player("a");
        player.selectChar();
        start();
    }

    public void start() {

        while (true) {
            System.out.println();
            System.out.println("==============");
            System.out.println();
            System.out.println("Eylem gerçekleştirmek için bir yer seçiniz");
            System.out.println("1. Güvenli Ev --> Size ait güvenli bir mekan, düşman yok!");
            System.out.println("2. Mağara --> Karşınıza belki zombi çıkabilir!");
            System.out.println("3. Orman --> Karşınıza belki vampir çıkabilir!");
            System.out.println("4. Ayı --> Karşınıza belki ayı çıkabilir!");
            System.out.println("5. Mağaza --> Silah veya zırh alabilirsiniz!");
            System.out.println("Gitmek istediğiniz yer..");
            int selLoc = scan.nextInt();
            while (selLoc < 0 || selLoc > 5) {
                System.out.print("Lütfen geçerli bir yer seçiniz..");
                selLoc = scan.nextInt();
            }
            switch (selLoc) {
                case 1 -> {
                    location = new SafeHouse(player);
                    break;
                }
                case 5 -> {
                    location = new ToolStore(player);
                    break;
                }

                default ->
                    location = new SafeHouse(player);

            }

            if (!location.getLocation()) {
                System.out.println("Oyun Bitti!");
                break;
            }
        }
    }
}
