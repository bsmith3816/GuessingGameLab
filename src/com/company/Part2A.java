package com.company;

import java.util.Scanner;

public class Part2A {
    public static int guessRandom(int low,int high){
        int x = high - low;
        int num = (int) Math.floor((Math.random() * x) + 1);
        if(num + low == low) {
            num++;
        }
        if(num + low == high){
            num--;
        }
        return num + low;
    }
    public static void main(String[] args) {
        boolean finished = false;
        int numGuess = 1;
        int num = 50;
        int min = 0;
        int max = 100;
        Scanner input = new Scanner(System.in);
        String reply;

        System.out.println("Welcome to the Guessing Game! What's your name?");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("I will try and guess a number you choose from 1 to 100. Please type in 'higher','lower' or 'correct' if the number you have in mind is higher, lower, or is correct respectively.");

        while(!finished){
            System.out.println(name + ", is the number " + num + "?");
            reply = input.nextLine();
            if(reply.equals("correct")){
                finished = true;
            }

            else if(reply.equals("higher")){
                if(num == 99){
                    min = num;
                    numGuess++;
                    num++;
                } else if(num - max == -1 || num == 100){
                    System.out.println("The number can't be any higher than this! Ending game due to user error. Sorry, " + name + "!");
                    System.exit(0);
                } else {
                    numGuess++;
                    min = num;
                    num = guessRandom(min, max);
                }
            }

            else if(reply.equals("lower")) {
                if(num - min == 1 || num == 0){
                    System.out.println("The number can't be any lower than this! Ending game due to user error. Sorry, " + name + "!");
                    System.exit(0);
                }
                numGuess++;
                max = num;
                num = guessRandom(min,max);

            }

            else {
                System.out.println("Hey " + name + ", please type either correct, higher or lower, or else I won't be able to answer!");
            }
        }

        if(numGuess == 1){
            System.out.println("Hooray! I have guessed the number in just one shot! GG, " + name + "!");
        }

        else {
            System.out.println("Hooray! I have guessed the number in " + numGuess + " tries! Thanks for playing, " + name + "!");
        }
    }
}
