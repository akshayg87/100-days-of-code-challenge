import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();

        String x = v(n);
        System.out.println("The given number is " + x);
    }

    static String v(int n)
    {
        String y;
        if (n%2 == 0){
            y = "EVEN";
        }
        else
            y = "ODD";
        return y;
    }
}
