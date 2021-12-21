package exercise;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        System.out.println("The factors of " + n + " are = ");

        for (int i = 1; i <= n ; i++)
        {
         int f = n%i;
         if(f==0)
         {
             System.out.println(i);
         }

        }
    }
}
