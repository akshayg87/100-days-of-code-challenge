package bitwise;
import java.util.Arrays;

public class sortIntegerBits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortBit(arr)));
    }

    static int[] sortBit(int[] arr)
    {
        int[] bits = new int[arr.length];
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            int n = arr[i];
            while(n > 0){
                if((n & 1) == 1){
                    count++;
                }
                n >>= 1;
            }
            bits[i] = count;
        }
        int l = 0;
        for(int j = 0; j <= 14; j++){
            for(int k = 0; k < bits.length; k++){
                if(j == bits[k]){
                    ans[l] = arr[k];
                    l++;
                }
            }
        }
        return ans;
    }
}
