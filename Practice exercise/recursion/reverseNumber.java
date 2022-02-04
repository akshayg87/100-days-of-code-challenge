public class reverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        reverse(n);
    }

    static void reverse(int n)
    {
        if (n<10) {
            System.out.println(n);
        }
        else
        {
            System.out.print(n % 10);
            reverse(n / 10);
        }
    }
}
