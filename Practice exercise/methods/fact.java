import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();

        System.out.println(n+"! is = " +factorial(n));
    }

    static int factorial(int n)
    {
        int fact=1;
        for (int i = 1; i <= n ; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
