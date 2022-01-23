package sorting;

public class arrayPartition {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1};
        bubbleSort(arr);

        System.out.println(arrayPairSum(arr));
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

    static int arrayPairSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) sum += nums[i];
        return sum;
    }
}