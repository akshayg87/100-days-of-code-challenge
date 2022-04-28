//Key Pair

import java.util.Arrays;

public class keyPair {
    public static void main(String[] args) {
        int X = 16;
        int[] Arr = {1, 4, 45, 6};
        System.out.println(isKeyPair(Arr,Arr.length,X));
    }

    static boolean isKeyPair(int[] arr, int n, int x){
        int l=0, r=n-1;
        Arrays.sort(arr);
        while (l<=r){
            int sum = arr[l]+arr[r];
            if (sum==x)
                return true;
            else if (sum<x)
                l++;
            else
                r--;
        }

        return false;
    }
}
