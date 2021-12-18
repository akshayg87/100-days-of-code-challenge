package exercise;

import java.util.Scanner;

public class largestno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int n1 = in.nextInt();
        System.out.println("Enter 2nd number : ");
        int n2 = in.nextInt();
        System.out.println("Enter 3rd number : ");
        int n3 = in.nextInt();
        int num;
        if(n1>n2)
            num = n1;
        else
            num = n2;

        if(num>n3)
            System.out.println("Largest number is = " + num);
        else
            System.out.println("Largest number is = " + n3);
    }
}
