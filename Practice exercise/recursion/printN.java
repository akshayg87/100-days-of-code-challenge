package recursion;

public class printN {
    public static void main(String[] args) {
       num(1, 5);
    }

    static void num(int i, int limit)
    {
        if (i==limit) {
            return;
        }

        System.out.println(i);
        num(limit, i+1);
    }
}
