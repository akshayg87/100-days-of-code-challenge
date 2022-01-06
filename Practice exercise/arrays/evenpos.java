package arrays;

import java.util.Scanner;

public class evenpos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        System.out.println("Elements present in the Even positions are:");

        for (int i = 1; i < n.length; i=i+2) {
            System.out.println(n[i]);
        }
    }
}
