package recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {6,3,8,10};
        int target = 3;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end)
    {
        if (start>end)
            return -1;

        int mid = (start + (end - start)) / 2;


            if (target == arr[mid])
                return mid;

            if (target < arr[mid])
               return search(arr, target, start, mid-1);

               return search(arr, target, mid+1, end);



    }
}
