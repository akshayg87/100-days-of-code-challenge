package exercise;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number =");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci series is: " );

        for(int i=0; i<=n; ++i)
            {
                System.out.print(a + ", ");
                int c = a + b;
                a = b;
                b = c;
            }
        }
}
