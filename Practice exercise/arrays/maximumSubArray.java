//Maximum Sub Array

import java.util.ArrayList;

public class maximumSubArray {
    public static void main(String[] args) {
        int[] arr ={1, 2, 5, -7, 2, 3};
        System.out.println(maxSubArray(arr,arr.length));
    }

    static ArrayList<Integer> maxSubArray(int[] arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int s=0;
        int start=0, end=0;
        long sum=0, max=0;

        for (int i=0; i<n; i++){
            sum = sum + arr[i];
            if (sum>max){
                max=sum;
                start=s;
                end=i;
            }

            if (arr[i]==0 && sum==max)
                end++;

            if (arr[i]<0){
                sum=0;
                s=i+1;
            }
        }

        if (max>0){
            for (int i = start; i <= end; i++)
                res.add(arr[i]);
            return res;
        }
        res.add(-1);
        return res;
    }
}
