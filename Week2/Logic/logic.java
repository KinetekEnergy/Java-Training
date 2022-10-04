import java.util.*;

public class logic {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);  // Create a Scanner object

        int tea = 0;
        int candy = 0;

        //scans for how much is there
        tea = scanf.nextInt();
        candy = scanf.nextInt();

        if (tea < 5 || candy < 5)
        {
            System.out.println("0");
        }
        else if (tea >= (candy*2) || candy >= (tea*2))
        {
            System.out.println("2");   
        }
        else if (tea >= 5 && candy >= 5)
        {
            System.out.println("1");
        }

        
        /*


            However, if either tea or candy is at least double the amount of 
            the other one, the party is great (2). 
            However, in all cases, if either tea or candy is less than 5, 
            the party is always bad (0).
            - teaParty(6, 8) → 1
            - teaParty(3, 8) → 0
            - teaParty(20, 6) → 2
        */



    }
}
