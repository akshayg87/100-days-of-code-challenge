//Move all negative elements to end
import java.util.Arrays;
public class moveNegatives {
    public static void main(String[] args){
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        int n = arr.length;
        System.out.println(Arrays.toString(move(arr,n)));
    }

    static int[] move(int[] arr, int n){
        int[] arr2 = new int[n];

        int po=0;
        for(int i=0; i<n; i++){
            if (arr[i]>0){
                arr2[po] = arr[i];
                po++;
            }
        }

        int ne=po;
        for (int i = 0; i < n; i++) {
            if (arr[i]<0){
                arr2[ne] = arr[i];
                ne++;
            }
        }

        System.arraycopy(arr2, 0, arr, 0, n);
        return arr;
    }
}
