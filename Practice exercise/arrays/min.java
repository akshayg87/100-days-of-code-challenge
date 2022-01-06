package arrays;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }

        int min=n[0];
        for (int i = 0; i < n.length; i++) {
            if(n[i]<min)
                min = n[i];
        }
        System.out.println("Minimum is " + min);

           }
}
