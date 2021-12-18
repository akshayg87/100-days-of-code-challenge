package exercise;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = in.next();
        String rev = "";

        int length = str.length();

        for (int i = length - 1; i>=0 ; i--)
        {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
            System.out.println(str + " is PALINDROME.");
        else
            System.out.println(str + " is NOT PALINDROME.");
    }
}
