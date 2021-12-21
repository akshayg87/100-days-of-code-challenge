package exercise;

import java.util.Scanner;

public class surfacearea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter edge of cube =");
        int a = in.nextInt();

        double area = 6 * a * a;
        System.out.println("The surface area of cube is = " + area);

    }

}
