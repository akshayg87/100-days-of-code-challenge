import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4};
        System.out.println(remove(nums));
    }

    static int remove(int[] nums) {

        int len = 1;
        for(int i =1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[len] = nums[i];
                len++;
            }

        }

        return len;
    }
}
