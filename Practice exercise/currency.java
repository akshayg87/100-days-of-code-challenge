package exercise;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount [in RS.] :");
        float rs = in.nextFloat();
        float usd = (float) (rs * .013);
        System.out.println("RS-" + rs + " in US Dollars is = USD-" + usd);
    }
}
