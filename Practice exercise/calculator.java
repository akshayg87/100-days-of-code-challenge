package exercise;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number =");
        int n1 = in.nextInt();
        System.out.println("Enter 2nd number =");
        int n2 = in.nextInt();
        System.out.println("Choose an operation [+, -, *, /, %] :");
        char op = in.next().charAt(0);

        if (op == '+')
        {
            int sum = n1 + n2;
            System.out.println("Sum = " +sum);
        }
        else if (op== '-')
        {
            int dif = n1 - n2;
            System.out.println("Difference =" +dif);
        }
        else if (op == '*')
        {
            int product = n1 * n2;
            System.out.println("Product = " +product);
        }
        else if (op=='/')
        {
            int quotient = n1/n2;
            System.out.println("Quotient =" +quotient);
        }
        else if (op== '%')
        {
            int rem = n1%n2;
            System.out.println("Remainder =" +rem);
        }
        else
            System.out.println("Invalid operator");
    }
}
