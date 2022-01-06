package arrays;

import java.util.Scanner;

public class secondlarge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }

        int temp;
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if(n[i]>n[j])
                {
                    temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        System.out.println("Second largest number is = " +n[n.length-2]);
    }
}
