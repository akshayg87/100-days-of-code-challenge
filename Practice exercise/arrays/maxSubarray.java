public class maxSubarray {
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    static  int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;

        for (int j = 0; j < nums.length; j++) {
            int i = nums[j];
            sum += i;
            max = Math.max(sum, max);

            if (sum < 0)
                sum = 0;
        }

        return max;
    }
}
