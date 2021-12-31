import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();

        System.out.println(palin(n));
    }

    static String palin(int i)
    {
        String f;
        int on=i, rem, r=0;
        while (i!=0) {
            rem = i % 10;
            r = r * 10 + rem;
            i = i / 10;
        }
        if(on==r)
        {
              f ="Palindrome";

        }
        else
        {
            f ="Not Palindrome";
        }
        return f;
    }

}
