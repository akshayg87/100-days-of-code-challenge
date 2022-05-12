//Maximum Product of Increasing Subsequence of Size 3

import java.util.ArrayList;
import java.util.Arrays;

public class maxSubsequenceOf3 {
public static void main(String[] args){
        int[] arr = {3, 4, 2, 1};
    System.out.println(maxProduct(arr,arr.length));
    }

    static ArrayList<Integer> maxProduct(int[] arr, int n){
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        int max=0;
        for (int i = n-1; i >= 2 ; i--) {
            int x = arr[i]*arr[i-1]*arr[i-2];
            max = Math.max(max,x);
        }

        if (max== arr[n-1]*arr[n-2]*arr[n-3]) {
            res.add(arr[n - 3]);
            res.add(arr[n - 2]);
            res.add(arr[n - 1]);
            return res;
        }
        res.add(-1);
        return res;
    }
}
