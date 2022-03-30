//Find Missing And Repeating
import java.util.Arrays;

public class MissingRepeating {
    public static void main(String[] args){
        int[] arr={5,2,1,2,4};
        int n = arr.length;
        System.out.println(Arrays.toString(findTwoElement(arr,n)));
    }

    static int[] findTwoElement(int[] arr, int n) {
        int[] res = new int[2];
        int i = 0;
        while (i < n) {
            if (arr[i] != arr[arr[i] - 1]) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            } else
                i++;
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                res[1] = j + 1;
                res[0] = arr[j];
            }
        }
        return res;
    }
}

