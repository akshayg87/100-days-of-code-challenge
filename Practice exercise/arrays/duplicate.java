package arrays;

import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        System.out.println("Duplicate items are:");

        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
               if (n[i] == n[j])
                   System.out.println(n[j]);
            }
        }
    }

}
