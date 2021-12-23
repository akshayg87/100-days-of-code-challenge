package intermediate;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, sum;
        System.out.println("Enter the number of years:");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " +n+ " year marks:");

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter marks of year " +(i+1)+ " :");
            a[i] = in.nextInt();
        }

        sum = 0;
        for (int i = 0; i < n; i++)
        {
        sum += a[i];
        }
        int cgpa = sum / n;
        System.out.println("CGPA is = " + cgpa);
    }
}
