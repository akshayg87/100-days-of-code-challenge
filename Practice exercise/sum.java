package intermediate;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, sum=0;

        System.out.println("How many numbers you want the sum for?");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter number " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }
        for (int i=0; i<n; i++)
        {
            sum+=a[i];
        }
        System.out.println("Sum of " +n+ " numbers is : " + sum);
    }
}
