//Column name from a given column number

public class columnName {
    public static void main(String[] args) {
        long n = 27;
        System.out.println(colName(n));
    }
    static String colName (long n)
    {
        StringBuilder sb = new StringBuilder();
        while(n-- > 0) {
            sb.insert(0, (char)(n % 26 + 'A'));
            n = n / 26;
        }
        return sb.toString();
    }
}
