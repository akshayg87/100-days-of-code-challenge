import java.util.Arrays;

public class kSmallest {
    public static void main(String[] args){
        int[] arr = {7,10,3,4,20,15};
        int k = 3;
        System.out.println(kth(arr,k));
    }

    static int kth(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}