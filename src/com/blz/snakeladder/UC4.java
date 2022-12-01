package com.blz.snakeladder;

import java.util.Random;

public class UC4 {
    public static void main(String[] args) {
        int playerPosition = 0;
        Random random = new Random();
        while (playerPosition != 100) {
            int diceRoll = random.nextInt(1, 7);
            int option = random.nextInt(0, 3);
            switch (option) {
                case 0:
                    System.out.println("no play ,the player stays in the same position");
                    break;
                case 1:
                    playerPosition += diceRoll;
                    System.out.println("player move ahead:" + diceRoll);
                    System.out.println("player got ladder,player new position is:" + playerPosition);
                    break;
                case 2:
                    playerPosition -= diceRoll;
                    System.out.println("player move behind:" + diceRoll);
                    System.out.println("player got snake ,player currunt position:" + playerPosition);
                    break;
            }
        }
    }
}
