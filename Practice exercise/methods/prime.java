import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();

        String p = p(n);
        System.out.println("The number " + n + " is " + p);
    }

    static String p(int n)
    {
        String p;
        boolean flag = false;
        for (int i = 2; i <= n/2 ; i++)
        {
                if(n%i == 0){
                    flag = true;
                    break;
                }
                i++;
        }
        if (!flag)
            p = "PRIME";
        else 
            p = "NOT PRIME";
        return p;
    }
}
