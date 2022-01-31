package recursion;

public class powerThree {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }

    static boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        return n % 3 == 0 && isPowerOfThree(n / 3);
    }
}
