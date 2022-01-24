package sorting;

import java.util.Arrays;

public class smallerArrays {
    public static void main(String[] args) {
        int[] arr = {5,5,5,1,2,0};

        System.out.println(Arrays.toString(small(arr)));
    }


    static int[] small(int[] arr)
    {
        int[] nums = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    nums[i]++;
            }
        }

        return nums;
    }
}
