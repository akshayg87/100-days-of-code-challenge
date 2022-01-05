package arrays;

import java.util.Scanner;

public class smallernum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the numbers:");
        int[] n = {10,20,30};
//        for (int i = 0; i < n[i]; i++) {
//            n[i] = in.nextInt();
//        }

        System.out.println("Enter the current number:");
        int c = in.nextInt();

        System.out.println("How many numbers are smaller than the current number? - " + small(n, c));
    }

    static int small(int[] n, int c)
    {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < c)
                count += 1;
        }
        return count;
    }
}
