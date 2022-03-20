import java.util.ArrayList;

public class subarraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int s = 10;
        System.out.println(SubarraySum(arr,s,arr.length-1));
    }

    static ArrayList<Integer> SubarraySum(int[] arr, int sum, int n) {
        ArrayList<Integer> arrli= new ArrayList<>();
        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum,
            // then return true
            if (curr_sum == sum) {
                int p = i - 1;
                arrli.add(start+1);
                arrli.add(p+1);
                return arrli;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }

        arrli.add(-1);
        return arrli;
    }
}