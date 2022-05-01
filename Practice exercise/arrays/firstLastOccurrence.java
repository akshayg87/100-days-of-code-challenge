import java.util.Arrays;

//First and last occurrences of x
public class firstLastOccurrence {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int x=5;
        System.out.println(Arrays.toString(occurrence(arr,arr.length,x)));
    }

    static int[] occurrence(int[] arr, int n, int x){
        int[] res = new int[2];

        for (int i = 0; i < n-1; i++) {
            if (arr[i]==x)
                res[1]=i;
        }

        for (int i = n-1; i >= 0; i--) {
            if (arr[i]==x)
                res[0]=i;
        }

        return res;
    }
}
