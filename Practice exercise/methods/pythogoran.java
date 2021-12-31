import java.util.Scanner;

public class pythogoran {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Formula is : a^2 + b^2 = c^2");
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        System.out.println("Enter c:");
        int c = in.nextInt();

        String p = pyth(a,b,c);
        System.out.println("The given numbers " +a+ ", " +b+ ", and " +c+ " are " +p+ " numbers.");
    }

    static String pyth(int a, int b, int c)
    {
        String p;
        int a2 = a*a;
        int b2 = b*b;
        int c2 = c*c;

        if ((a2 + b2)==c2)
        {
            p = "Pythagorean";
        }
        else
            p = "Not pythagorean";

        return p;
    }
}
