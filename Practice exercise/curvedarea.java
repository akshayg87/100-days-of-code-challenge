package exercise;

import java.util.Scanner;

public class curvedarea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of cylinder =");
        int r = in.nextInt();
        System.out.println("Enter height of cylinder =");
        int h = in.nextInt();

        double area = 2 * 3.14 * r * h;
        System.out.println("The curved surface area of cylinder is = " + area);

    }
}
