package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class relativeSort {
    public static void main(String[] args) {
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};

        System.out.println(Arrays.toString(sort(arr1, arr2)));

    }


    static int[] sort (int[] arr1, int[] arr2)
    {
        int[] res=new int[arr1.length];
        int index=0;
        Arrays.sort(arr1);
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr1[j]==arr2[i]){
                    res[index]=arr1[j];
                    index++;
                }
            }
        }
        boolean present;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            present=false;
            for(int j=0; j< arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    present=true;
                    break;
                }
            }
            if(!present){
                list.add(arr1[i]);
            }
        }
        for(int i=0; i<list.size(); i++){
            res[index]=list.get(i);
            index++;
        }
        return res;
    }
}
