package com.company;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        boolean finished = false;
        int numGuess = 1;
        int num = 50;
        int min = 1;
        int max = 100;
        int x;
        Scanner input = new Scanner(System.in);
        String reply;

        System.out.println("Welcome to the Guessing Game! I will try and guess a number you choose from 1 to 100. Please type in 'higher','lower' or 'correct' as I make guesses");

        while(!finished){
            System.out.println("Is the number " + num + "?");
            reply = input.nextLine();
            if(reply.equals("correct")){
                finished = true;
            }

            else if(reply.equals("higher")){
                numGuess++;
                min = num;
                x = max - min - 1;
                if(x < 0){
                    System.out.println("Impossible! This has to be the number!");
                    finished = true;
                }
                 */
                /* if(x == 1){
                    num++;
                    while(!finished) {
                        System.out.println("The number has to be " + num + ".");
                        reply = input.nextLine();
                        if (reply.equals("correct")) {
                            finished = true;
                        } else {
                            System.out.println("There's no way it can be any other number!");
                        }
                    }
                } */
                num = (int) Math.floor((Math.random() * x) + 1);
                num += min;
            }

            else if(reply.equals("lower")) {
                numGuess++;
                max = num;
                x = max - min - 1;
                num = (int) Math.floor((Math.random() * x) + 1);
                num += min;
            }

            else {
                System.out.println("Please type either correct, higher or lower, or else I won't be able to answer!");
            }
        }

        if(numGuess == 1){
            System.out.println("Hooray! I have guessed the number in just one shot!");
        }

        else {
            System.out.println("Hooray! I have guessed the number in " + numGuess + " tries!");
        }
    }
}
