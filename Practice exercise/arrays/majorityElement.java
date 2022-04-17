//Majority Element

import java.util.Arrays;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(majorItem(arr, arr.length));
    }

    static int majorItem(int[] arr, int n){
        int count = 1;
        int r = n/2;
        Arrays.sort(arr);

        for(int i=1; i<n; i++){
            if (arr[i] == arr[i-1])
                count++;

            if (count > r)
                return arr[i];
        }

        return -1;
    }
}
