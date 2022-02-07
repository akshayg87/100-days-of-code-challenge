import java.util.ArrayList;
import java.util.Arrays;

public class arrayIntersection {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};

        System.out.println(Arrays.toString(Intersecton(num1, num2)));
    }

    static int[] Intersecton(int[] nums1, int[] nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] small = nums1.length <= nums2.length ? nums1 : nums2;
        int[] large = nums1.length > nums2.length ? nums1 : nums2;
        int lastNum = -1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : small){
            if (num != lastNum && binarySearch(large, num)) {
                list.add(num);
            }
            lastNum = num;
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    static boolean binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}

