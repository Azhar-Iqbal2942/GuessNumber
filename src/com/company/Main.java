package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // This will Generate random number between (1 , 100)
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have randomly chosen  a number between 1 and 100");
        System.out.println("Try to guess it");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have" + i + " guess(es) left. Choose Again:");
            int guess = scanner.nextInt();

            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess + " Guess");
            } else if (randomNumber > guess) {
                System.out.println("It's greater than " + guess + " Guess");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Correct.....You Won!");
        } else {
            System.out.println("GAME OVER .......YOU LOSE!!!!");
            System.out.println("The Number Was " + randomNumber);
            System.out.println("Better Luck next Time");
        }
    }
}
