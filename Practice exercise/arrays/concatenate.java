package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class concatenate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter elements for Array 1:");
        int[] a1 = new int[2];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = in.nextInt();
        }

        System.out.println("Enter elements for Array 2:");
        int[] a2 = new int[2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = in.nextInt();
        }

        int fal =a1.length;
        int sal =a2.length;
        int[] res = new int[fal+sal];
        System.arraycopy(a1,0,res,0,fal);
        System.arraycopy(a2,0,res,fal,sal);

        System.out.println("Concatenated array is");
        System.out.println(Arrays.toString(res));

    }
}
