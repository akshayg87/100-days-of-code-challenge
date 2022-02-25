package recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        int[] ans = merge(arr);
        System.out.println(Arrays.toString(ans));
    }
    //Recursive Call by spliting into 2 arrays
    static int[] merge(int[] arr){
        if (arr.length == 1)
            return arr;

        int mid = arr.length/2;
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));
        return Merge(left,right);
    }

    // Merges 2 split arrays to one
     static int[] Merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i<first.length && j<second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j<first.length){
             mix[k] = second[j];
             j++;
             k++;
         }

        return mix;
    }
}
