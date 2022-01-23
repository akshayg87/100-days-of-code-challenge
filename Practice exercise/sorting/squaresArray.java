package sorting;

import java.util.Arrays;

public class squaresArray {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        bubbleSort(arr);

        System.out.println(Arrays.toString(sq(arr)));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static int[] sq(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }
        bubbleSort(arr);
        return arr;
    }
}
