package sorting;

import java.util.Arrays;

public class specialArray {
    public static void main(String[] args) {
        int[] arr = {3,5};
        System.out.println(special(arr));

    }

    static int special(int[] nums)
    {
        Arrays.sort(nums); // first sort the array
        for (int i = 0; i <= nums[nums.length - 1]; i++) { // start from 0 to the last element maximum element in nums
            int count = 0; //count all elements greater then 0 to the last element
            int j = 0;
            while (j < nums.length) {
                if (i <= nums[j]) { //if the number less than the remaning of the elements increase the count
                    count++;
                }
                j++;
            }
            if (count == i) //when the number is equal to the count then return the number
                return i;
        }
        return -1;
    }
}
