//Find Pair Given Difference
import java.util.Arrays;
public class pairDifference {
    public static void main(String[] args){
        int N = 78;
        int[] arr = {5, 20, 3, 2, 5, 80};
        System.out.println(findPain(arr,arr.length,N));
    }

    static boolean findPain(int[] arr, int l, int n){
        Arrays.sort(arr);

        for(int i=l-1; i>=0; i--){
            for(int j=0; j<l; j++){
                if (arr[i]-arr[j] == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
