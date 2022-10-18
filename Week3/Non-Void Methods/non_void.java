import java.io.*;
import java.util.*;

public class non_void {
    public static void main(String[] args) {

       

        String s = string_function("hubert");
        int i = int_function(5);
        boolean b = bool_function(true);


        System.out.println(s);
        System.out.println(i);
        System.out.println(b);
    }

    public static String string_function(String s)
    {
        String sn = s + " is friends with Albert";

        return sn;
    }

    public static int int_function(int f)
    {
        int fn = f*2;
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