import java.util.*;

public class classes_objects {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in); // scanf
        // <TYPE> input = scanf.next<TYPE>(); format
        // next.Int() for integers
        Me myObj = new Me();

        /*
         * Create a class called "Me" & intialize variables name and age
         * - Create parameters for these variables and set them to the variables in the
         * constructor
         * Create 2 method that returns your name and age
         * Create an object for this class in the main method, & use the method to
         * print!
         */
    }

    class Me
    {
        Stridng name;
        int age;

        Me(String n, int a)
        {
            name = n;
            age = a;
        }

    }

    public static String name (String n)
    {
        return n;
    }

    public static int age(int age)
    {
        return age;
    }
}
