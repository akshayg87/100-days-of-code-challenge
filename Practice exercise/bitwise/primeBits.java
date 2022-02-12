package bitwise;

public class primeBits {
    public static void main(String[] args) {
        int left = 6;
        int right = 10;
        System.out.println(CountBits(left, right));
    }

    static int CountBits(int left, int right) {
        int count = 0;
        while (left <= right) {
            if (isPrime(left++))
                count++;
        }

        return count;
    }

    static boolean isPrime(int n) {
        int c = 0, i;
        while (n > 0) {
            c += n & 1;
            n >>= 1;
        }

        if (c == 1) return false;

        for (i = 2; i <= c / 2; i++) {
            if (c % i == 0) {
                return false;
            }

           }

        return true;
    }
}
