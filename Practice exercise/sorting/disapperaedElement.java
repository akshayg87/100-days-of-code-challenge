package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class disapperaedElement {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5};
        System.out.println(items(arr));
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

    static List<Integer> items(int[] nums) {
        List<Integer> list = new ArrayList<>();

        bubbleSort(nums);

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) list.add(j + 1);
        }
        return list;
    }
}
