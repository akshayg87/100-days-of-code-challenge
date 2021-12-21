package exercise;

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a shape :");
        System.out.println("[Circle = c, Triangle = t, Rectangle = r, Parallelogram = p, Rhombus/Square = s]");
        char c = in.next().charAt(0);
        double per;

        if (c == 'c') {
            System.out.println("Enter radius =");
            int r = in.nextInt();
            per = 2 * 3.14 * r;
            System.out.println("Perimeter of circle is = " + per);
        } else if (c == 't') {
            System.out.println("Enter Side 1 =");
            int s1 = in.nextInt();
            System.out.println("Enter Side 2 =");
            int s2 = in.nextInt();
            System.out.println("Enter base =");
            int b = in.nextInt();
            per = s1 + s2 + b;
            System.out.println("Perimeter of triangle is = " + per);
        } else if (c == 'r') {
            System.out.println("Enter length =");
            int l = in.nextInt();
            System.out.println("Enter width =");
            int w = in.nextInt();
            per = 2 * (l + w);
            System.out.println("Perimeter of rectangle is = " + per);
        } else if (c == 'p') {
            System.out.println("Enter base =");
            int b = in.nextInt();
            System.out.println("Enter side =");
            int h = in.nextInt();
            per = 2*(b + h);
            System.out.println("Perimeter of parallelogram is = " + per);
        } else if (c == 's') {
            System.out.println("Enter side =");
            int a = in.nextInt();
            per = 4*a;
            System.out.println("Perimeter of rhombus is = " + per);
        }
        else
            System.out.println("Please choose a shape from choices above!!!");
    }
}
