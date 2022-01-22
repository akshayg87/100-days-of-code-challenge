package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersection {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1};
        int[] arr2 = {3, 8,2, 5};
        bubbleSort(arr1);
        bubbleSort(arr2);
        System.out.println(Arrays.toString(inter(arr1, arr2)));
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

    static int[] inter(int[] nums1, int[] nums2) {
        int top = 0, bottom = 0;
        List<Integer> h = new ArrayList<>();

        while (true)
        {
            if (top >= nums1.length || bottom >= nums2.length)
                break;

            if (nums1[top] == nums2[bottom])
            {
                if(!h.contains(nums1[top]))
                {
                    h.add(nums1[top]);
                }
                top++;
                bottom++;
            }

            else if (nums1[top] < nums2[bottom])
            {
                top++;
            }
            else if (nums1[top] > nums2[bottom])
            {
                bottom++;
            }
        }

        int[] g = new int[h.size()];
        for (int i = 0; i < h.size(); i++) {
            g[i] = h.get(i);
        }
        return g;

    }

}