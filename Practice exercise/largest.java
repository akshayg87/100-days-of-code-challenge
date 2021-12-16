import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter 1st number =");
        int n1 = in.nextInt();
        System.out.println("Enter 2nd number =");
        int n2 = in.nextInt();
        if (n1>n2)
            System.out.println(n1 + " is larger");
        else if(n1==n2)
            System.out.println("Both are equal");
        else
            System.out.println(n2 +" is larger");
    }
}
