package intermediate;

import java.util.Scanner;

public class appdep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Buying price [in $]:");
        double i = in.nextInt();
        System.out.println("Enter Current value [in $]:");
        double f = in.nextInt();

        if (f>i)
            System.out.println("The property has APPRECIATED");
        else
            System.out.println("The property has DEPRECIATED");

        double c = f-i;
        System.out.println("By " + c + "$");
        double p = ((f-i)/i)*100;
        System.out.println("In percentage " + p + "%");
    }
}
