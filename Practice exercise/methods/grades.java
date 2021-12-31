import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int m = in.nextInt();

        String grades = grade(m);
        System.out.println("Result = " + grades);
    }

    static String grade(int m)
    {
        String g = switch (m / 10) {
            case 10 -> "AA";
            case 9 -> "AB";
            case 8 -> "BB";
            case 7 -> "BC";
            case 6 -> "CD";
            case 5 -> "DD";
            default -> "FAIL";
        };
        return g;
    }
}
