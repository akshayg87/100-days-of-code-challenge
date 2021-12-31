import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Print prime numbers between a and b:");
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();

        primeno obj = new primeno();
        System.out.println("The prime numbers are:");
        obj.prime(a,b);

    }

    static void prime(int a, int b)
    {
        int count;

        for (int i = a; i <= b ; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(i);
        }
    }
}
