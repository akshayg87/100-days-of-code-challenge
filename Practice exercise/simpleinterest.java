import java.sql.SQLOutput;
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Simple Interest Calculator");
        System.out.println("Enter Principal [in $]:");
        int p = in.nextInt();
        System.out.println("Enter time [in years]:");
        int t = in.nextInt();
        System.out.println("Enter interest rate [in %]:");
        float r = in.nextFloat();
        float si = p*t*r/100;
        System.out.println("Simple Interest is = "+ si);

    }
}
