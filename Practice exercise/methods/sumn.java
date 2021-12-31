import java.util.Scanner;

public class sumn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();

        System.out.println("The sum is = " + sum(n));
    }

    static int sum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
