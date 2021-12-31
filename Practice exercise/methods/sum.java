import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = in.nextInt();
        System.out.println("Enter second number:");
        int n2 = in.nextInt();

        int sum = sum(n1,n2);
        System.out.println("The sum is = " + sum);
    }

    static int sum(int n1, int n2)
    {
        int sum;
        sum = n1+n2;
        return sum;
    }
}
