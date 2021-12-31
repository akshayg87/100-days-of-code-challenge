import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = in.nextInt();
        System.out.println("Enter second number:");
        int n2 = in.nextInt();
        System.out.println("Enter third number:");
        int n3 = in.nextInt();

        int max = max(n1, n2, n3);
        int min = min(n1, n2, n3);
        System.out.println("The maximum is = " + max);
        System.out.println("The minimum is = " + min);

    }

    static int max(int n1, int n2, int n3)
    {
        int max = n1;
        if (n2 > max){
            max = n2;}
        if (n3 > max){
            max = n3;}

        return max;
    }

    static int min(int n1, int n2, int n3)
    {
        int min = n1;
        if (n2 < min){
            min = n2;}
        if (n3 < min){
            min = n3;}

        return min;
    }

}
