package sorting;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr ={3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(indices(arr,target)));
    }

    static int[] indices(int[] arr, int target)
    {
        int[] indices = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target )
                {
                    indices[0] = j;
                    indices[1] = i;
                }
            }
        }

        return indices;
    }
}
