import java.util.Arrays;

//Array Subset of another array
public class subsetArray {
    public static void main(String[] args){
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11,3,12};
        System.out.println(subset(arr1,arr2));
    }

     static boolean subset(int[] arr1, int[] arr2) {
        if (arr2.length > arr1.length)
            return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);
         int i=0, j=0;

         while(i<arr1.length && j<arr2.length)
         {
             if(arr1[i]!=arr2[j])
             {
                 i++;
             }
             else
             {
                 i++;
                 j++;
             }
         }

         return j == arr2.length;

     }
}
