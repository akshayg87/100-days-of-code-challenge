package intermediate;

import java.util.Scanner;

public class futurevalue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the present value [in $]:");
        double pv = in.nextInt();
        System.out.println("Enter the growth (or) interest rate [in %]:");
        double i = in.nextInt();
        i = i / 100;
        System.out.println("Enter time period [in years]:");
        double t = in.nextInt();

        double fv = Math.pow((1 + i), t) * pv;
        System.out.println("Future value is = " +fv);
    }
}
