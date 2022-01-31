package recursion;

public class prime {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(isPrime(n, 2));
    }

    // Returns true if n is prime, else
    // return false.
    // i is current divisor to check.
    static boolean isPrime(int n, int i)
    {
        // Base cases
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }
}
