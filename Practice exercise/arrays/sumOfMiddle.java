//Sum of Middle Elements of two sorted arrays

import java.util.Arrays;

public class sumOfMiddle {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 10};
        int[] arr2 = {4, 5, 6, 9, 12};
        System.out.println(findMidSum(arr1,arr2,arr1.length));
    }

    static int findMidSum(int[] ar1, int[] ar2, int n) {
        int len = ar1.length + ar2.length;
        int[] arr = new int[len];

        for (int i = 0; i < n; i++) {
            arr[i] = ar1[i];
        }

        int j = 0;
        for (int i = n; i < arr.length; i++) {
            arr[i] = ar2[j];
            j++;
        }

        Arrays.sort(arr);

        return arr[arr.length / 2] + arr[(arr.length / 2) - 1];
    }
}
