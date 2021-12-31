import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius:");
        int r  = in.nextInt();

        double area = area(r);
        double cir = cir(r);
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + cir);
    }

    static double area(int n)
    {
        return 3.14 * n * n;
    }

    static double cir(int n)
    {
        return 2 * 3.14 * n;
    }
}
