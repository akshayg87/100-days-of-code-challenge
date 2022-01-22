package sorting;


public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {5,1,1,1,1,1};
        System.out.println(majority(arr));
    }

    static int majority(int[] nums) {
        sort(nums);
        return nums[(nums.length - 1) / 2];
    }

    static void sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
