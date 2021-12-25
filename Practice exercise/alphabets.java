package intermediate;

import java.util.Scanner;

public class alphabets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char c = in.next().charAt(0);

        switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(c + " is an vowel");
            default -> System.out.println(c + " is a consonant");
        }
    }
}
