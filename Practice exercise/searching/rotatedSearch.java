public class rotatedSearch {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }

    static int search(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if (nums[mid] == target)
                return mid;

            else if (nums[mid] >= nums[start])
            {
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

            else
            {
                if (target <= nums[end] && target > nums[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }


        return -1;
    }
}
