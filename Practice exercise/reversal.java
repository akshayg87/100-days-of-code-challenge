package exercise;

import java.util.Scanner;

public class reversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.next();
        String nstr = "";
        char ch;

        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("The new string is: " + nstr);

    }
}
