//Product array puzzle

import java.util.Arrays;
public class productPuzzle {
    public static void main(String[] args){
        int[] nums = {10, 3, 5, 6, 2};
        System.out.println(Arrays.toString(productArray(nums,nums.length)));
    }

    static int[] productArray(int[] arr, int n){
        int[] res = new int[n];

        for (int i=0; i<n; i++) {
            int p = 1;
            for (int j = 0; j < n; j++) {
                if (i!=j){
                    p=p*arr[j];
                }
            }
            res[i] = p;
        }
        return res;
    }
}
