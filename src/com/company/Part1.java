package com.company;

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double random = Math.floor(Math.random() * 10) + 1;
        String thenumber = Double.toString(random);
        thenumber = thenumber.substring(0,1);
        boolean answer = false;
        String guess;
        System.out.println("Try and guess the integer I'm thinking of, from 1 to 10.");
        while(!answer){
            guess = input.nextLine();
            if(guess.equals(thenumber)){
                answer = true;
            } else {
                System.out.println("Oh, that was the wrong number! Try again.");
            }
        }
        System.out.println("Good job! You guessed the correct number! You deserve a cookie : )");
    }
}
