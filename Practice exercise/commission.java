package intermediate;

import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the cost [in $]:");
        int cost = in.nextInt();

        System.out.println("Enter the commission [in $]:");
        int com = in.nextInt();

        int p = (com*100)/cost;
        System.out.println("The commission percentage is = " + p + "%");
    }
}
