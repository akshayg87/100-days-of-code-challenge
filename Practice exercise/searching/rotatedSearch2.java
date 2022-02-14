public class rotatedSearch2 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 10;
        System.out.println(search(nums,target));
    }
    static boolean search(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            if (nums[mid] == target)
                return true;

            else if (nums[mid] >= nums[start]){
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

            else {
                if (target <= nums[end] && target > nums[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }


        return false;
    }
}
