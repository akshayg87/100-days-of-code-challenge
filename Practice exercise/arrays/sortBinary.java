import java.util.Arrays;

public class sortBinary {
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,2};
        int[] res = sort(arr, arr.length);
        System.out.println(Arrays.toString(res));

    }

    static int[] sort(int[] arr, int n){
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) n1++;
            if (arr[i] == 2) n2++;
        }

        for (int i = 0; i < n; i++) {
            if (i < (n - (n1 + n2))) arr[i] = 0;
            else if (i <  (n - n2)) arr[i] = 1;
            else arr[i] = 2;
        }
        return arr;
    }
}
