package sorting;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {0,3,5,2,4};
        System.out.println(missing(arr));
    }
    static int missing(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex])
                Swap(nums, i, correctIndex);
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) return j;
        }
        return nums.length;
    }

    static void Swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

