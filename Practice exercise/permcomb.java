package intermediate;

import java.util.Scanner;

public class permcomb {
    double fact(double n)
    {
    int i=1;
    double fact = 1;
    while (i<=n)
    {
        fact=fact*i;
        i++;
    }
    return fact;
    }

    double permutaion(int n, int r){
        return fact(n)/fact(n-r);
    }

    double combination(int n, int r){
        return fact(n)/(fact(n-r)*fact(r));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Permutation and Combination Calculator");
        System.out.println("Enter n:");
        int n = in.nextInt();
        System.out.println("Enter r:");
        int r = in.nextInt();

        permcomb a = new permcomb();

        if (n>=r) {
            System.out.println("Permutation of " + n + "P" + r + " is = " + a.permutaion(n,r));
            System.out.println("Combination of " + n + "C" + r + " is = " + a.combination(n,r) );
        }
        else
            System.out.println("Please enter number where n>r");
    }
}
