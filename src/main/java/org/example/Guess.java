package org.example;
import java.util.Scanner;

public class Guess {


    public static void runGuess(int answer) {
        Scanner guess = new Scanner(System.in);
        int number = guess.nextInt();
        if (number == answer) {
            System.out.println("You guessed the correct answer.");
        }  else {
            if (Math.abs(answer - number) <= 5) {
                System.out.println("Ouch! You're really hot!");
            } else {
                System.out.println("Oooh! You're really cold!");
            }
            runGuess(answer);
        }
    }

    public static void main(String[] args) {
        int answer = (int) (Math.random() * 101);
        System.out.println("Guess a number between 1 and 100");
        runGuess(answer);
        }

}
