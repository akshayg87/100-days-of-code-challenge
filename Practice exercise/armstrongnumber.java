package intermediate;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int n1 = in.nextInt();
        System.out.println("Enter 2nd number:");
        int n2 = in.nextInt();

        for (int i = n1; i < n2; i++)
        {
            int check, rem, sum = 0;
            check = i;
            while (check != 0)
            {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if (sum == i)
            {
                System.out.println(sum + " is an Armstrong number.");
            }
        }

    }
}
