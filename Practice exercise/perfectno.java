package intermediate;

import java.util.Scanner;

public class perfectno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();

        int i =1, sum=0;
        while (i<=n/2)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        if(sum==n){
            System.out.println(n+ " is a perfect number.");
        }
        else
            System.out.println(n+" is not a perfect number");
    }
}
