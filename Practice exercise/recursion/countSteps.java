package recursion;

public class countSteps {
    public static void main(String[] args) {
     int n = 8;
        System.out.println(count(n, 0));
    }

    static int count(int n, int steps)
    {
        if (n==0)
            return steps;

        if (n%2 == 0)
            return count(n/2, steps+1);

        return count(n-1, steps+1);
    }
}
