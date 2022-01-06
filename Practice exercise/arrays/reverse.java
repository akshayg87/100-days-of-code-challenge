package arrays;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }

        System.out.println("Original Array:");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ", ");
        }
        System.out.println("");
        System.out.println("Reversed array:");
        for (int i = n.length-1; i >= 0; i--) {
            System.out.print(n[i] + ", ");

        }

    }

}
