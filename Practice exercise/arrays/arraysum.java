package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraysum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements for Array 1:");
        int[] a1 = new int[3];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = in.nextInt();
        }

        System.out.println("Enter elements for Array 2:");
        int[] a2 = new int[3];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = in.nextInt();
        }

        System.out.println("The sum of arrays are: " + Arrays.toString(sum(a1,a2)));
    }

    static int[] sum(int[] a1, int[] a2)
    {
        int[] sum = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
                sum[i] = a1[i] + a2[i];
        }
        return sum;
    }
}
