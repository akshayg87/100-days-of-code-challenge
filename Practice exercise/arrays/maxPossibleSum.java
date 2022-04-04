//Maximum Possible Sum of Products
import java.util.Arrays;

public class maxPossibleSum {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 1};
        System.out.println(maxSum(A,B));
    }

    static int maxSum (int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int sum = 0;
        for (int i=0; i<arr1.length; i++){
            sum += arr1[i]*arr2[i];
        }

        return sum;
    }
}
