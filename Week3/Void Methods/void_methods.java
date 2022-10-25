import java.io.*;
import java.util.*;

public class void_methods 
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in); //scanf
        // <TYPE> input = scanf.next<TYPE>(); format
        // next.Int() for integersname(String name)

        float input = 0;
        input = scanf.nextFloat();

        function(input); //send to input



        /*
         * - Make a void that will only print if the number you pass in (parameter) is
         * greater than 10
         * - Run this method with numbers 0.37 & 49
         */
    }
    static void function(float i)
    {
        if (i > 10)
        {
            System.out.println(i);
        }
        else
        {
            System.exit(0);
        }
    }
}