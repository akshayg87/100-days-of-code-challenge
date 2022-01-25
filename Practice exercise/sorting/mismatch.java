package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mismatch {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(correct(arr));
    }

    static List<Integer> correct(int[] arr)
    {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1])
            {
                list.add(arr[i]);
                list.add(arr[i] + 1);
            }
        }


        return list;
    }
}
