package intermediate;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number =");
        int n1 = in.nextInt();
        System.out.println("Enter 2nd number =");
        int n2 = in.nextInt();

        int lcm = Math.max(n1, n2);

        while(true)
        {
            if(lcm % n1 == 0 && lcm % n2 ==0)
            {
                System.out.println("LCM = " + lcm);
                break;
            }
            ++lcm;
        }
    }
}
