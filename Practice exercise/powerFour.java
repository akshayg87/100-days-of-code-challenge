package recursion;

public class powerFour {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(isPowerOfFour(n));
    }

    static boolean isPowerOfFour(int n)
    {
        if (n==1 || n==4)
            return true;
        else if (n%4 != 0 || n==0)
            return false;

        return isPowerOfFour(n/4);
    }
}
