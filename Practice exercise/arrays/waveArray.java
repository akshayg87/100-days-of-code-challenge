import java.util.Arrays;

public class waveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(Arrays.toString(wave(arr,n)));
    }

    static int[] wave(int[] arr, int n){
        for (int i=0; i<n-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
}
