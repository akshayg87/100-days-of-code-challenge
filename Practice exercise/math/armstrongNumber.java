package math;

public class armstrongNumber {
    public static void main(String[] args) {
        int n = 1634;
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n)
    {
        String p = Integer.toString(n);
        int a = n;
        int pow = p.length();
        int arm = 0;

        while (n!=0)
        {
           arm += Math.pow((n%10), pow);
           n /= 10;
        }

        return  (arm == a);

    }
}
