package arrays;

import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = in.nextLine();

        int[] count = new int[26];
        boolean flag = true;
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (ch == ' ')
                continue;

            if(ch>='A' && ch<='Z')
            {
                count[ch-'A']++;
            }
            else if (ch>='a' && ch<='z')
            {
                count[ch-'a']++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i]==0)
            {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram string");
    }
}
