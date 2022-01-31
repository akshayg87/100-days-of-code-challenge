package recursion;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));


    }
    static void sort(int[] arr, int n)
    {
        if (n<=1)
            return;

            sort(arr, n-1);

            int key = arr[n-1];
            int j = n - 2;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
    }
}

