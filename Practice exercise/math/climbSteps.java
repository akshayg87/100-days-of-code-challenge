package math;

public class climbSteps {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climb(n));
    }

    static int climb(int n)
    {
        if (n==1) return 1;
        if (n==2) return 2;
        return climb(n-1) + climb(n-2);
    }
}
