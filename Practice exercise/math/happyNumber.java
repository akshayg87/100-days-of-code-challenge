package math;

public class happyNumber {
    public static void main(String[] args){
        int n = 20;
        System.out.println(happyNum(n));
    }

    static boolean happyNum(int n)
    {
        int slow, fast;
        slow = fast = n;

        do {
            slow = (ishappyNum(slow));

            fast = ishappyNum(ishappyNum(fast));
        }
        while(slow != fast);

        return (slow == 1);
    }

    static int ishappyNum(int n)
    {
        int squareSum = 0;

        while(n!=0)
        {
         squareSum += (n%10) * (n%10);
         n /= 10;
        }

        return squareSum;
    }
}
