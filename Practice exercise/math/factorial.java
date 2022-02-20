package math;

public class factorial {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }

    static int fact (int n)
    {
        int f = 1;

        if(n==0 || n==1)
            return 1;

        while (n!=0){
            f = f * n;
            n--;
        }
        return f;
    }
}
