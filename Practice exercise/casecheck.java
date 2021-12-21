package exercise;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a alphabet:");
        char ch = in.next().charAt(0);

        if(ch>='a' && ch<='z')
            System.out.println("Lowercase");
        else if(ch>='A' && ch<='Z')
            System.out.println("Uppercase");
         else
            System.out.println("Please enter only alphabets.");
    }
}
