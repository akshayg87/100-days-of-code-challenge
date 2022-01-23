package sorting;

public class perimeter {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1};
        bubbleSort(arr);

        System.out.println(per(arr));
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

    static int per(int[] nums)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i+2<nums.length && nums[i]+nums[i+1]>nums[i+2])
                // if first two number is greater than the last means two max number is available
            {
                sum =  nums[i]+nums[i+1]+nums[i+2];
                // if true then just sum all three side(formula of perimeter)
            }
        }
        return sum;
        // return just sum
    }
}
