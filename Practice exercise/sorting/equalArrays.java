package sorting;

import java.util.Arrays;

public class equalArrays {
    public static void main(String[] args) {
        int[] target = {3,7,1,9};
        int[] arr = {3,7,9,1};

        System.out.println(canBeEqual(target, arr));
    }

    static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }
}