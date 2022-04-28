//Move all zeroes to end of array

import java.util.Arrays;

public class pushZeroes {
    public static void main(String[] args){
        int[] arr = {3,4,0,0,1};
        System.out.println(Arrays.toString(pushZeroToEnd(arr,arr.length)));
    }

    static int[] pushZeroToEnd(int[] arr, int n){
        int count = 0;
        for(int i=0; i<n; i++){
            if (arr[i]>0)
                arr[count++] = arr[i];
        }
        while (count<n)
            arr[count++] = 0;

        return arr;
    }
}
