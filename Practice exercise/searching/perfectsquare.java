package search;

public class perfectsquare {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(isBoolean(n));
    }

    static boolean isBoolean(int n){
        int start = 0, end = n/2;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(mid*mid == n)
                return true;

            else if(mid*mid < n)
            {
                start = mid + 1;
            }
            else if (mid*mid > n)
            {
                end = mid - 1;
            }

        }
        return false;
    }
}
