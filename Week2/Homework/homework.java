//import java.util.Scanner;  // Import the Scanner class
import java.io.*;
import java.util.*;

public class homework 
{
    static void calculate() //calculates what user wants and displays it
    {
        Scanner scanf = new Scanner(System.in);  // Create a Scanner object
        // <TYPE> input = myObj.next<TYPE>();  format
        // next.Int() for integers
    
        System.out.println("<First Number> <Operator> <Second Number>"); //prompt for user input

        //IMPORTANT: int[2] does NOT make an array of three elements
        //As opposed to C, new int[2] creates an array of TWO elements
        //Indexing for creation doesn't start at zero but indexing for ACCESSING starts at 0
        int numbers[] = new int[2]; //IMPORTANT: int[2] 

        //IMPORTANT: char[1] does NOT make an array of two elements
        //As opposed to C, new char[1] creates an array of ONE element
        //Indexing for creation doesn't start at zero but indexing for ACCESSING starts at 0
        char operator[] = new char[1]; 

        numbers[0] = scanf.nextInt(); 
        operator[0] = scanf.next().charAt(0); 
        //char operator = scanf.next().charAt(0);
        numbers[1] = scanf.nextInt(); 

        int answer = 0;
        double answerD = 0;

        
        switch(operator.toString()) //computes equation with corresponding operator[0]
        {
            case "+": //addition
                answer = numbers[0] + numbers[1];
                System.out.println(numbers[0] + " " + operator.toString() + " " + numbers[1] + " = " + answer);
                break;
            case "-": //subtraction
                answer = numbers[0] - numbers[1];
                System.out.println(numbers[0] + " " + operator.toString() + " " + numbers[1] + " = " + answer);
                break;
            case "*": //multiplication
                answer = numbers[0] * numbers[1];
                System.out.println(numbers[0] + " " + operator.toString() + " " + numbers[1] + " = " + answer);
                break;
            case "/": //division
                answer = numbers[0] / numbers[1];
                System.out.println(numbers[0] + " " + operator.toString() + " " + numbers[1] + " = " + answer);
                break;
            case "%": //modulus
                answer = numbers[0] % numbers[1];
                System.out.println(numbers[0] + " " + operator.toString() + " " + numbers[1] + " = " + answer);
                break;
            case "^": //power
                answer = numbers[0] ^ numbers[1];
                System.out.println(numbers[0] + " " + operator.toString() + " " + numbers[1] + " = " + answer);
                break;
            case "s": //square root
                answerD = numbers[0] * Math.sqrt(numbers[1]);
                System.out.println(numbers[0] + "sqrt(" + numbers[1] + ") = " + answerD);
                break;
            case "c": //cube root
                answerD = numbers[0] * java.lang.Math.cbrt(numbers[1]);
                System.out.println(numbers[0] + " * cbrt(" + numbers[1] + ") = " + answerD);
                break;  
            case "h": //hypotenuse
                answerD = Math.sqrt((numbers[0] * numbers[0]) + (numbers[1] * numbers[1])); //numbers[#] ^ 2 doesn't work for some reason :/
                System.out.println("Hypotenuse of " + numbers[0] + " & " + numbers[1] + " = " + answerD);
                break;
            default: //error message
                System.out.println("FATAL ERROR: User entered unknown operator.");
                System.out.println("Terminating...");
                System.exit(0);
        }

        recalculate_prompt(); //send user for the recalculation
    }

    static void recalculate_prompt() //prompts user for recalculation
    {
        Scanner scanf = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Do you want to make another calculation? [y/n]"); //prompt for recalculate
        char recalculate; //declare
        recalculate = scanf.next().charAt(0); //scan it

        int user_decision;
        user_decision = decision(recalculate); //send to Y/N function to decide

        if (user_decision == 1) //wants to recalculate
        { 
            calculate(); //start the recalculation
        }
        else if (user_decision == 0) //doesn't want to recalculate
        { 
            System.exit(0); //terminates the program
        }
        else if (user_decision == 2) //if they entered something random
        {
            recalculate_prompt_D2();
        }
    }

    static void recalculate_prompt_D2() //for when they enter a random
    {
        Scanner scanf = new Scanner(System.in);  // Create a Scanner object


        System.out.println("ERROR: User entered invalid input.");
        System.out.println("Did you mean to exit the program? [y/n]");
        
        char recalculate; //declare
        int user_decision; //for their decision

        recalculate = scanf.next().charAt(0); //scan it
        user_decision = decision(recalculate); //sent to Y/N

        if (user_decision == 1) //wants to exit
        {
            System.exit(0);
        }
        else if (user_decision == 0) //wants to recal
        {
            recalculate_prompt();
        } 
        else if (user_decision == 2) //random input
        {
            recalculate_prompt_D2();
        }
    }

    static int decision(char input) 
    {
        Scanner scanf = new Scanner(System.in); //Create a Scanner object

        if (input == 'y' || input == 'Y') //account for caps or no caps
        {
            System.out.println("[sudo] password for admin: "); //this does nothing it's just there for fun! :)
            System.console().readPassword(); //the password does no use, just for fun! :D

            return 1;
        }
        else if (input == 'n' || input == 'N') //account for caps or no caps
        {
            return 0;
        }
        else //if user enters something random
        {
            return 2; //bools wouldn't work for a third option, used ints instead
        }
    }
    public static void main(String[] args) 
    {

        //using a function can allow for recalculation
        //starts the program
        calculate(); 

        /*
            Operations should consist of 
                cube root, 
            - Challenge: Use one input statement for the first number, operation, and the second number. (Hint: Seperate the inputs by spaces)
            - Store the numbers & operations in two different arrays
        */
    }
    
    private static void exit(int i) 
    {
        //01100100 00110010 01101000 00110101 01001001 01000111 01010010 01110000 01011010 01000011 01000010 00110101 01100010 00110011 01010101 01100111 01011010 01000111 01010110 01101010 01100010 00110010 01010010 01101100 01001001 01001000 01010010 01101111 01100001 01011000 01001101 01110101 
    }
}
