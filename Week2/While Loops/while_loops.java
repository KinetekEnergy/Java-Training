public class while_loops {
    public static void main(String[] args) {
        /*
         * - Iteratively divide 64 by 2 and stop when the quotient is equal to 1
         * - Print the number at every iteration
         */

        int num = 64;
        System.out.println(num);

        while (num > 1)
        {
            num /=2;
            System.out.println(num);
        }
    }
}
