package com.blz.snakeladder;

import java.util.Random;

public class UC2 {
    public static void main(String[] args) {
        Random random = new Random();
        int  diceRoll=random.nextInt(1,7);
        System.out.println("current position dice is:"+diceRoll);
    }
}
