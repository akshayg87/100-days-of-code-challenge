package recursion;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr, int n) {
        // Base case
        if (n == 1)
            return;

        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        // Largest element is fixed,
        // recur for remaining array
        bubble(arr, n - 1);
    }
}
