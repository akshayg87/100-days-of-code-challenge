//Triplet Sum in Array

import java.util.Arrays;

public class tripletSum {
    public static void main(String[] args){
        int[] arr = {1, 45, 6, 10, 8};
        int x = 13;
        System.out.println(find3numbers(arr,arr.length,x));
    }

    static boolean find3numbers(int[] arr, int n, int x){
        Arrays.sort(arr);
        for (int i=0; i<=n-3; i++){
            int target = x - arr[i];
            int j = i+1;
            int k = n-1;

            while (j<k){
                int sum = arr[j] + arr[k];
                if (sum == target)
                    return true;
                else if (target > sum)
                    j++;
                else
                    k--;
            }
        }
    return false;
    }
}
