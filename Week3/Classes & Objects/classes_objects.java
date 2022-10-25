public class classes_objects
{
    public class Me { //this is the class
        int age;
        String name;

        public Me() { //this is the constructor
            age = 14;
            name = "aashray";
        }

        public int age(int age)
        {
            return age;
        }

        public String name(String name)
        {
            return name;
        }
    }
    public static void main(String[] args) {
        Me myObj = new Me(); // Create an object of Main
        myObj.age(14); // Call the public method on the object
        myObj.name("name"); // Call the public method on the object

    }
    


}

/*
 * Create a class called "Me" & intialize variables name and age
 * Create parameters for these variables and set them to the variables in the
 * constructor
 * Create 2 method that returns your name and age
 * - Create an object for this class in the main method, & use the method to
 * print!
 */