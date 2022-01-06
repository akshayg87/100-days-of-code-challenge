package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class copyarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        System.out.println("The new array is " + Arrays.toString(copy(n)));
    }

    static int[] copy(int[] n)
    {
        int[] copy = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            copy[i] = n[i];
        }
        return copy;
    }
}
