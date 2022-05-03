//Rearrange Array Alternately

import java.util.Arrays;

public class rearrangeArray {
    public static void main(String[] aargs){
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110};
        System.out.println(Arrays.toString(rearrange(arr,arr.length)));
    }

    static int[] rearrange(int[] arr, int n){
        int[] res = new int[n];
        int i=1, j=0;

        for (int k = 0; k < n; k++) {
            res[i] = arr[k];
            i+=2;
            if (i>=n)
                break;
        }

        for (int k = n-1; k >= 0; k--) {
            res[j] = arr[k];
            j+=2;
            if (j>=n)
                break;
        }

        return res;
    }
}
