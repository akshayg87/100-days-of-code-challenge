package intermediate;

import java.util.Scanner;

public class electricbill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the units consumed = ");
        int u = in.nextInt();
        int t;

        if (u<=100)
        {
            t = u * 10;
            System.out.println("Total = " + t);
        }
        else if (u<=200){
            t = (100 * 10) + ((u - 100) * 15);
            System.out.println("Total = " + t);
        }
        else if(u<=300){
            t = (100 * 10) + (100 * 15) + ((u - 200) * 20);
            System.out.println("Total = " + t);
        }
        else if (u>300)
        {
            t = (100 * 10) + (100 * 15) + (100 * 20) + ((u - 300) * 25);
            System.out.println("Total = " + t);
        }
    }
}
