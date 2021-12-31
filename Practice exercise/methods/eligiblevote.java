import java.util.Scanner;

public class eligiblevote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = in.next();
        System.out.println("Enter age:");
        int age = in.nextInt();

        String e = e(age);
        System.out.println(name + " is " + e + " to vote.");
    }

    static String e(int n)
    {
        String e;
        if(n>=18)
            e = "ELIGIBLE";
        else
            e = "NOT ELIGIBLE";
        return e;
    }
}
