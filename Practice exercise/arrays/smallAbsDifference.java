//Smallest Absolute Difference

import java.util.ArrayList;
import java.util.Collections;

public class smallAbsDifference {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 3;
        System.out.println(absDifference(arr,arr.length,k));
    }

    static int absDifference(int[] arr, int n, int k){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                list.add(Math.abs(arr[i]-arr[j]));
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}
