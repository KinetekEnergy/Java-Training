//package Week2.Imports;
import java.io.*;
import java.util.*;
import java.lang.Math;

public class imports {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);  // Create a Scanner object

        int max = 100;
        int min = 1;

        //Random random = new Random();
        //int randomNum = min + random.nextInt(max);
        int randomNum = 10;

        int guesses = 0;
        int user_guess = 0;

        while (guesses < 5)
        {
            System.out.println("Guess the number in order to save your family which I have captured-- I mean, to win a prize!");
            user_guess = scanf.nextInt(); //scan their guess

            if (user_guess == randomNum) //they guessed correctly
            {
                System.out.println("You guessed the number!");
                guesses++;
            }
            else if (user_guess > randomNum) //guessed too high
            {
                System.out.println("Too high!");
                guesses++;
            }
            else if (user_guess < randomNum) //guessed too low
            {
                System.out.println("Too low!");
                guesses++;
            }
        }


        /*
            Create a number guessing game with the following requirements! (Import Scanner and Math)
            Generate a random number between 1 and 100
            Ask the user to guess the number
            If the user guesses the number, print "You guessed the number!"
            If the user guesses too high, print "Too high!"
            If the user guesses too low, print "Too low!"
            - If the user guesses the number more than 5 times, print "You lose!"
        */

    }
}
