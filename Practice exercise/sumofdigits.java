package intermediate;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();

        int sum = 0, i;
        while (n!=0)
        {
         i=n%10;
         sum += i;
         n /= 10;
        }
        System.out.println("The sum of digits are = "+sum);
    }
}
