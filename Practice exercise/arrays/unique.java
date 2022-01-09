package arrays1;

import java.util.Arrays;

public class unique {
    public static void main(String[] args) {
        int n =2;

        System.out.println(Arrays.toString(arr(n)));
    }

    static int[] arr(int n)
    {
        int[] arr = new int[n];
        int total = 0;
        int num = n;
        for(int i = 0;i<n-1;i++)
        {
            arr[i]=num-1;
            total+=num-1;
            num--;
        }
        arr[n-1]=-(total);
        return arr;
    }
}
