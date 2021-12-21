package exercise;

import java.util.Scanner;

public class volume {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Choose a shape :");
        System.out.println("[Cone = c, Prism = p, Cylinder = b, Sphere = s, Pyramid = d]");
        char c = in.next().charAt(0);
        double vol;

        if (c == 'c') {
            System.out.println("Enter radius =");
            int r = in.nextInt();
            System.out.println("Enter height =");
            int h = in.nextInt();
            vol = (3.14 * r * r * h)/3;
            System.out.println("Volume of cone is = " + vol);
        } else if (c == 'p') {
            System.out.println("Enter height =");
            int h = in.nextInt();
            System.out.println("Enter base =");
            int b = in.nextInt();
            vol = b * h;
            System.out.println("Volume of prism is = " + vol);
        } else if (c == 'b') {
            System.out.println("Enter radius =");
            int r = in.nextInt();
            System.out.println("Enter height =");
            int h = in.nextInt();
            vol = 3.14 * r * r *h;
            System.out.println("Volume of cylinder is = " + vol);
        } else if (c == 's') {
            System.out.println("Enter radius =");
            int r = in.nextInt();
            vol = (4 * 3.14 * r * r * r)/3;
            System.out.println("Volume of sphere is = " + vol);
        } else if (c == 'd') {
            System.out.println("Enter length =");
            int l = in.nextInt();
            System.out.println("Enter width =");
            int w = in.nextInt();
            System.out.println("Enter height =");
            int h = in.nextInt();
            vol = (l * w * h)/3.0;
            System.out.println("Volume of pyramid is = " + vol);
        }
        else
            System.out.println("Please choose a shape from choices above!!!");
    }
}
