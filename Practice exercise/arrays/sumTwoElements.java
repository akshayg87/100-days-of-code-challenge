//Sum of two elements with sum nearest to zero

import java.util.Arrays;

public class sumTwoElements {
    public static void main(String[] args){
        int[] arr = {-21, -67, -37, -18, 4, -65};
        System.out.println(closestToZero(arr,arr.length));
    }

    static int closestToZero(int[] arr, int n){
        Arrays.sort(arr);
        int start=0, end=n-1;
        int ans = arr[0]+arr[n-1];
        while (start<end){
            int sum = arr[start]+arr[end];
            if (sum==0)
                return 0;
            if (sum<0)
                start++;
            else
                end--;
            if (Math.abs(sum)<Math.abs(ans))
                ans=sum;
            if (Math.abs(sum)==Math.abs(ans))
                ans=Math.max(sum,ans);
        }
        return ans;
    }
}
