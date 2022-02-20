package math;

public class powerOfFour {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(powerFour(n));
    }

    static boolean powerFour(int n)
    {
        if (n == 1)
            return true;

        for (int i = 0; i < n/2; i++) {
            if (Math.pow(4, i) == n) {
                return true;
                }
        }
        return false;
    }

}
