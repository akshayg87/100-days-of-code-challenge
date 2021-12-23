package intermediate;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Power Calculator : Using Work done & Time taken");

        System.out.println("Enter the work done [in Joules]:");
        int w = in.nextInt();

        System.out.println("Enter time taken [in Seconds]:");
        int t = in.nextInt();

        int p = w/t;
        System.out.println("Power is = " +p+ " Watts");
    }
}
