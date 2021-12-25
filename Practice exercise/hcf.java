package intermediate;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number =");
        int n1 = in.nextInt();
        System.out.println("Enter 2nd number =");
        int n2 = in.nextInt();

        while(n2 != 0)
        {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        System.out.println("HCF = " + n1);
    }
}
