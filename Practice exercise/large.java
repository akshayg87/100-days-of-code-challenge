package intermediate;

import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, max;
        System.out.println("Enter the number of elements: ");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }

        max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Largest number is = " + max);
    }
}
