package sorting;

import java.util.Arrays;

public class bitSort {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }

    public static int byteCount(int n){
        int count=0;
        while(n!=0){
            if(n%2==1)
                count++;
            n/=2;
        }
        return count;
    }
    static int[] sortByBits(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int max=-100;
        int res[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
            max=Math.max(max,byteCount(arr[i]));
        for(int i=0;i<=max;i++){
            for(int j=0;j<n;j++){
                if(byteCount(arr[j])==i)
                    res[k++]=arr[j];
            }
        }
        return res;
    }
}

