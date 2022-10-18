import java.util.*;

public class classes_objects {
    public class Me
    {
        String name;
        int age;

        static void name ()
        {
            System.out.println(name);
        }

        static void age()
        {
            System.out.println(age);
        }

        public static void main(String[] args) {
            Me myObj = new Me();

            myObj.name = "walter";
            myObj.age = 40;

            name();
            age();
    
            /*
             * Create an object for this class in the main method, & use the method to
             * print!
             */
        }
    }
    

    
}
