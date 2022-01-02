package arrays;

import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of candies:");
        int[] candies = new int[5];
        for (int i = 0; i < candies.length; i++) {
            candies[i] = in.nextInt();
        }

        System.out.println("Enter extra candies");
        int extra = in.nextInt();

        for(boolean x : kidswithcandies(candies, extra)) {
            System.out.println(x+ ", ");
        }
    }

    static boolean[] kidswithcandies(int[] candies, int extra) {
        int n = candies.length, maxCandies = 0;
        for (int i = 0; i < n; i++)
        {
            if (candies[i]>maxCandies)
                maxCandies = candies[i];}

            boolean[] result = new boolean[n];

        for (int i = 0; i < n; i++) {
            result[i] = (candies[i] + extra>=maxCandies);
        }
        return result;
    }
}
