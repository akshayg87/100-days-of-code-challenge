package arrays;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        int max = n[0];

        for (int i = 0; i < n.length; i++) {
            if (n[i] > max)
                max = n[i];
        }
        System.out.println("Maximum is " + max);

    }
}
