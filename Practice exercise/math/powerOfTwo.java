package math;

public class powerOfTwo {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(power(n));
    }

    static boolean power(int n){
        if (n==1)
            return true;

        for (int i = 0; i <= n/2; i++) {
        if (Math.pow(2,i) == n)
            return true;
        }
        return false;
    }
}
