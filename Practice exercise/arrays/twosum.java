package arrays1;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        int target = 5;

        System.out.println(Arrays.toString(sum(arr, target)));
    }

    static int[] sum(int[] arr, int target)
    {
        int[] res = new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
