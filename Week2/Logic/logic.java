public class logic {
    public static void main(String[] args) {
        int tea = 69;
        int candy = 420;

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
    }
}