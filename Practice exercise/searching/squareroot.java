package search;

public class squareroot {
    public static void main(String[] args) {
        int x = 26;
        System.out.println(sqrt(x));
    }
    static int sqrt(int x)
    {
        int left=0, right=x;
        int res= -1;
        while (left<=right)
        {
            int mid = left+(right-left)/2;
            long square = (long) mid*mid;
            if(square == x)
            {
                return mid;
            }
            else if(square<x)
            {
                res = mid;
                left =mid +1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return res;
    }
}
