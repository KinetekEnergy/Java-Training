import java.io.*;
import java.util.*;

public class non_void {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in); // scanf
        // <TYPE> input = scanf.next<TYPE>(); format
        // next.Int() for integers

        //scanf everything
        String inputS = scanf.nextLine();
        float inputF = scanf.nextFloat();
        boolean inputB = scanf.nextBoolean();
       

        string_function(inputS);
        float_function(inputF);
        bool_function(inputB);


        System.out.println(inputS);
        System.out.println(inputF);
        System.out.println(inputB);
    }

    public static String string_function(String s)
    {
        String sn = s + " is friends with Albert";

        return sn;
    }

    public static float float_function(float f)
    {
        float fn = f*2;
        return fn;
    }

    public static boolean bool_function(boolean b)
    {
        if (b = true)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}