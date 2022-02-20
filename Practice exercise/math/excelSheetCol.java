package math;

public class excelSheetCol {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(colValue(n));
    }

    static String colValue(int n)
    {
        String s = "";
        char[] c = "ZABCDEFGHIJKLMNOPQRSTUVWXY".toCharArray();

        while (n!=0)
        {
            s = c[n%26] + s;
            if (n % 6 == 0)
                n -= 26;
            n /= 26;
        }

        return s;
    }
}
