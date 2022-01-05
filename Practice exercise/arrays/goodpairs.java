package arrays;

import java.util.Scanner;

public class goodpairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int[] n = new int[4];
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }

        System.out.println("The number of good pairs are = " + pairs(n));
    }

    static int pairs(int[] n){
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length ; j++) {
                if (n[i]==n[j])
                    count = count + 1;
            }
        }
        return count;
    }
}
