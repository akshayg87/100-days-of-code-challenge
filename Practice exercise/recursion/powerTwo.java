package recursion;

public class powerTwo {
    public static void main(String[] args) {
        int n = 64;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n) {
        if(n ==0)
            return false;

        if(n == 1)
            return true;
        else if(n % 4 ==0)
            return isPowerOfTwo(n/4);
        else if(n %2 == 0)
            return isPowerOfTwo(n/2);
        else
            return false;
    }
}
