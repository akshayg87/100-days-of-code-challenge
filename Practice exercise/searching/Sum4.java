import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static void main(String[] args) {
        int[] arr = {1,1,-1,0,-2,2};
        int target = 4;
        System.out.println(fourSum(arr,target));
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return sum4(nums, target);
    }

     static List<List<Integer>> sum4(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int x = target - (nums[i] + nums[j]);
                int front = j + 1;
                int back = n - 1;
                while (front < back) {
                    if ((nums[front] + nums[back]) > x) back--;
                    else if ((nums[front] + nums[back]) < x) front++;
                    else if ((nums[front] + nums[back]) == x) {
                        List<Integer> l1 = new ArrayList<>();
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[front]);
                        l1.add(nums[back]);
                        l.add(new ArrayList<>(l1));
                        front++;
                        back--;
                        while (front < back && nums[front] == nums[front - 1]) front++;
                        while (front < back && nums[back] == nums[back + 1]) back--;
                    }

                }
                while (j + 1 < n && nums[j] == nums[j + 1]) j++;
            }
            while (i + 1 < n && nums[i] == nums[i + 1]) i++;
        }
        return l;
    }


}

