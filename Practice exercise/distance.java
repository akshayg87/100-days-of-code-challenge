package intermediate;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1 values: ");
        int x1 = in.nextInt();
        System.out.println("Enter y1 values: ");
        int y1 = in.nextInt();

        System.out.println("Enter x2 values: ");
        int x2 = in.nextInt();
        System.out.println("Enter y2 values: ");
        int y2 = in.nextInt();

        double d = Math.sqrt( ( (x2-x1)*(x2-x1) ) + ( (y2-y1)*(y2-y1) ) );
        System.out.println("Distance between points A(" +x1+ "," +y1+ ") and B(" +x2+ "," +y2+ ") is = " + d);
    }
}
