//Large Factorial

import java.util.Arrays;

public class factorialArray {
    public static void main(String[] args) {
        int[] arr = {5,6,3};
        System.out.println(Arrays.toString(factorail(arr,arr.length)));
    }

    static int[] factorail(int[] arr, int n){
        int[] ans = new int[n];
        for (int i = 0; i < n ; i++) {
            ans[i] = fact(arr[i]);
        }
        return ans;
    }

    static int fact(int n){
        if (n==0 || n==1)
            return 1;

        return n*fact(n-1);
    }
}
