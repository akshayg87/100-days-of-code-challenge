public class singleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
        System.out.println(single(nums));
    }
    static int single(int[] nums)
    {
        int s = 0;
        int e = nums.length-1;

        if (s==e)
            return nums[s];


        while (s<=e){
            if (nums[s]==nums[s+1] && nums[e]==nums[e-1]){
                s=s+2;
                e=e-2;
            }

            else if (nums[s]!=nums[s+1])
                return nums[s];

            else
                return nums[e];
        }

        return nums[s];
    }
}
