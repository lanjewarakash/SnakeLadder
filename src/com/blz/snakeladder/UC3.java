package com.blz.snakeladder;

import java.util.Random;
import java.util.Scanner;

public class UC3 {
    public static void main(String[] args) {
        int startPosition=0;
        int playerPosition=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("starting position of player is:"+startPosition);
        Random random=new Random();
        int dice_roll=random.nextInt(1,7);
        System.out.println("roll the die:"+dice_roll);

        int option=random.nextInt(0,3);
        switch (option) {
            case 0:
                //no play
                System.out.println("no play ,the player stays in the same position");
                break;
            case 1:
                //ladder
                playerPosition += dice_roll;
                System.out.println("player move ahead:" + dice_roll);
                System.out.println("player got ladder,player new position is:" + playerPosition);
                break;
            case 2:
                //snake
                playerPosition -= dice_roll;

                System.out.println("player move behind:" + dice_roll);
                System.out.println("player got snake ,player current position:" + playerPosition);
                break;
        }
    }
}
