public class digitProduct {
    public static void main(String[] args) {
        int n = 505;
        System.out.println(sum(n));
    }

    static int sum(int n)
    {
        if (n%10 == n)
            return n;

        return (n%10) * sum(n/10);
    }
}
