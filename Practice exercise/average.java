package intermediate;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        double x = in.nextInt();
        double y, avg = 0;

        System.out.println("Enter " + x + " numbers : ");
        for (int i = 0; i < x ; i++) {
            y = in.nextInt();
            avg += y;
        }
        avg = avg / x;
        System.out.println("Average is  = " + avg);
    }
}
