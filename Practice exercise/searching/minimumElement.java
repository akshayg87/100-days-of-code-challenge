public class minimumElement {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(min(nums));
    }

    static int min(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;
        int min  = nums[0];

        while (start<=end)
        {
            int mid = start + (end-start)/2;

            if (nums[mid] < min){
                min = nums[mid];
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return min;
    }
}
