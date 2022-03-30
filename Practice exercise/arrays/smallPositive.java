//Smallest Positive missing number
import java.util.Arrays;
public class smallPositive {
    public static void main(String[] args) {
        int[] arr = {0,-10,1,3,5,-20};
        int N = arr.length;
        System.out.println(missingNumber(arr,N));
    }

    static int missingNumber(int[] arr, int N){
        Arrays.sort(arr);
        int missing=1;

        for(int x:arr){
            if (x==missing){
                missing++;
            }
        }

        return missing;
    }
}
