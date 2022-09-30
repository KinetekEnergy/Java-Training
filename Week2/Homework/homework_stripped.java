//import java.util.Scanner;  // Import the Scanner class
import java.io.*;
import java.util.*;

public class homework_stripped 
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
        //char operator[] = new char[1]; 

        numbers[0] = scanf.nextInt(); 
        //operator[0] = scanf.next().charAt(0); 
        char operator = scanf.next().charAt(0);
        numbers[1] = scanf.nextInt(); 

        int answer = 0;
        double answerD = 0;

        
        switch(operator) //computes equation with corresponding operator[0]
        {
            case '+': //addition
                answer = numbers[0] + numbers[1];
                System.out.println(numbers[0] + " " + operator + " " + numbers[1] + " = " + answer);
                break;
            case '-': //subtraction
                answer = numbers[0] - numbers[1];
                System.out.println(numbers[0] + " " + operator + " " + numbers[1] + " = " + answer);
                break;
            case '*': //multiplication
                answer = numbers[0] * numbers[1];
                System.out.println(numbers[0] + " " + operator + " " + numbers[1] + " = " + answer);
                break;
            case '/': //division
                answer = numbers[0] / numbers[1];
                System.out.println(numbers[0] + " " + operator + " " + numbers[1] + " = " + answer);
                break;
            case '%': //modulus
                answer = numbers[0] % numbers[1];
                System.out.println(numbers[0] + " " + operator + " " + numbers[1] + " = " + answer);
                break;
            case '^': //power
                answer = numbers[0] ^ numbers[1];
                System.out.println(numbers[0] + " " + operator + " " + numbers[1] + " = " + answer);
                break;
            case 's': //square root
                answerD = numbers[0] * Math.sqrt(numbers[1]);
                System.out.println(numbers[0] + "sqrt(" + numbers[1] + ") = " + answerD);
                break;
            case 'c': //cube root
                answerD = numbers[0] * java.lang.Math.cbrt(numbers[1]);
                System.out.println(numbers[0] + " * cbrt(" + numbers[1] + ") = " + answerD);
                break;
            case 'h': //hypotenuse
                answerD = Math.sqrt((numbers[0] * numbers[0]) + (numbers[1] * numbers[1])); //numbers[#] ^ 2 doesn't work for some reason :/
                System.out.println("Hypotenuse of " + numbers[0] + " & " + numbers[1] + " = " + answerD);
                break;
            default: //stderr
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
        char recalculate = scanf.next().charAt(0); //scan it


        if (recalculate == 'y') //wants to recalculate
        { 
            calculate(); //start the recalculation
        }
        else if (recalculate == 'n') //doesn't want to recalculate
        { 
            System.exit(0); //terminates the program
        }
        else //stderr if user enters random
        {
            System.out.println("FATAL ERROR: User entered unknown operator.");
            System.out.println("Terminating...");
            System.exit(0);
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
}