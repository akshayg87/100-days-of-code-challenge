package search;

import java.util.Arrays;

public class doubleExists {
    public static void main(String[] args) {
        int[] arr = {1,0,40,1};
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
    // Intutively : we can run through the array (using a for loop) and for each element -> I will calculate 2*arr[i] ---> and then search it up in the array by calling a function --->search will be binary search to reduce time complexity

    Arrays.sort(arr);

    int res;

    for(int i = 0; i<arr.length; i++)
    {
        res = check_binarySearch(arr, arr[i]*2);
        if(res != i && res != -1)
        {
            return true;
        }
    }

    return false;
}

    static int check_binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }

        return -1;
    }
}
