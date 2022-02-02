package recursion;

public class consecutiveDuplicate {
    public static void main(String[] args) {
        String s = "aaabbb";
        System.out.println(duplicate(s));
    }

    static String duplicate(String s)
    {
        if (s.length() <= 1)
            return s;

        if (s.charAt(0) == s.charAt(1))
            return duplicate(s.substring(1));

        else
            return s.charAt(0) + duplicate(s.substring(1));
    }
}
