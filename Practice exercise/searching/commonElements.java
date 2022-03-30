//Common elements
import java.util.ArrayList;
public class commonElements {
    public static void main(String[] args){
        int n1 = 6;
        int[] A = {1, 5, 10, 20, 40, 80};
        int n2 = 5;
        int[] B = {6, 7, 20, 80, 100};
        int n3 = 8;
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.println(common(A,B,C,n1,n2,n3));
    }

    static ArrayList<Integer> common(int[] A, int[] B, int[] C, int n1, int n2, int n3){
        ArrayList<Integer> elems = new ArrayList<>();

        for(int a :A){
            int b = binarySearch(B, 0,n2-1,a);
            int c = binarySearch(C, 0,n3-1,a);
            if(b!=-1 && c!=-1){
                if(!elems.contains(a)){
                    elems.add(a);
                }
            }

        }

        return elems;
    }

    static int binarySearch(int[] arr, int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
