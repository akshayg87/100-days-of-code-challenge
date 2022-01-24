package sorting;

import java.util.Arrays;

public class arithmeticProgression {
    public static void main(String[] args) {
        int[] arr = {5,0,3,7,9};
        System.out.println(ap(arr));
    }

    static boolean ap(int[] arr)
    {
        Arrays.sort(arr);
        int k = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] - arr[i-1] != k)
                    return false;
            }

        return true;
    }
}
