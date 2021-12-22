package intermediate;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the cost: ");
        double c = in.nextInt();

        System.out.println("Enter the discount [in %]: ");
        double d = in.nextInt();

        double s = c * (d/100);
        double t = c - s;

        System.out.println("Discount added is [in $]: " + s);
        System.out.println("Total payable amount is: " + t);
    }
}
