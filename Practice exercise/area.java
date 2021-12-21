package exercise;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a shape :");
        System.out.println("[Circle = c, Triangle = t, Rectangle = r, Parallelogram = p, Rhombus = s]");
        char c = in.next().charAt(0);
        double area;

        if(c=='c')
        {
            System.out.println("Enter radius =");
            int r = in.nextInt();
            area = 3.14 * r;
            System.out.println("Area of circle is = " + area);
        }
        else if(c=='t')
        {
            System.out.println("Enter height =");
            int h = in.nextInt();
            System.out.println("Enter base =");
            int b = in.nextInt();
            area = (h*b)/2.0;
            System.out.println("Area of triangle is = " + area);
        }
        else if(c=='r')
        {
            System.out.println("Enter length =");
            int l = in.nextInt();
            System.out.println("Enter width =");
            int w = in.nextInt();
            area = l*w;
            System.out.println("Area of rectangle is = " + area);
        }
        else if(c=='p')
        {
            System.out.println("Enter base =");
            int b = in.nextInt();
            System.out.println("Enter height =");
            int h = in.nextInt();
            area = b*h;
            System.out.println("Area of parallelogram is = " + area);
        }
        else if (c=='s')
        {
            System.out.println("Enter Diagonal 1 =");
            int d1 = in.nextInt();
            System.out.println("Enter Diagonal 2 =");
            int d2 = in.nextInt();
            area = (d1*d2)/2.0;
            System.out.println("Area of rhombus is = " + area);
        }
        else
            System.out.println("Please choose a shape from choices above!!!");
    }
}
