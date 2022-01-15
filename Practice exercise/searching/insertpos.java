package search;

public class insertpos {
    public static void main(String[] args) {
        int[] arr = { 1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr,target));
    }
    static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        while(left < right) {
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
                mid = (left + right) / 2;
            }
            else {
                right = mid - 1;
                mid = (left + right) / 2;
            }
        }

        if(target > nums[mid]) {
            return mid + 1;
        }
        return mid;
    }
}
