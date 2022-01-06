package arrays;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }

       int fr[] = new int[n.length];
        int visited = -1;
        for (int i = 0; i < n.length; i++) {
            int count = 1;
            for (int j = i+1; j < n.length; j++) {
                if (n[i]==n[j])
                {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i]!=visited)
                fr[i] = count;
        }
        System.out.println("-------------");
        System.out.println("Element | Frequency");
        System.out.println("-------------");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i]!=visited)
                System.out.println("   " +n[i]+ " | " +fr[i] );
        }
        System.out.println("-------------");

    }
}
