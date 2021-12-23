package intermediate;

import java.util.Scanner;

public class compoundinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Principal [in $]:");
        int p = in.nextInt();

        System.out.println("Enter interest rate [in %]:");
        double r = in.nextDouble();

        System.out.println("Enter n [number of times compounded per period - EG:For 12 months; enter 12.]:");
        int n = in.nextInt();

        System.out.println("Enter time [in years]:");
        int t = in.nextInt();

        double a = p * Math.pow(1+(r/n), n*t);
        double cint = a - p;
        System.out.println("Compound interest after " +t+ " years: " + cint);
        System.out.println("Amount after " +t+ " years: " + a);
    }
}
