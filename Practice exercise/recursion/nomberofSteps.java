public class nomberofSteps {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numSteps(n));
    }
    static int numSteps(int num){
        return helper(num, 0);
    }

    private static int helper(int num, int steps){
        if (num==0)
            return steps;

        if (num%2 == 0)
            return helper(num/2, steps+1);

        return helper(num-1, steps+1);
    }
}
