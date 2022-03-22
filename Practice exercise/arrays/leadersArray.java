import java.util.ArrayList;
import java.util.Collections;

public class leadersArray {
    public static void main(String[] args) {
        int n = 5;
        int[] A = {17,4,3,5,2};
        System.out.println(leaders(A,n));
    }

    static ArrayList<Integer> leaders(int[] arr, int n){
        ArrayList<Integer> list = new ArrayList<>();

        int value = arr[n-1];
        list.add(value);

        for(int i=n-2;i>=0;i--){
            if(arr[i]>=value){
                value = arr[i];
                list.add(value);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
