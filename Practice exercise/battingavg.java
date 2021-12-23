package intermediate;

import java.util.Scanner;

public class battingavg {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the runs scored:");
        int r = in.nextInt();

        System.out.println("Enter the number of times out:");
        int t = in.nextInt();

        int avg = r/t;
        System.out.println("Batting Average = " +avg);
    }
}
