public class BitonicPoint {
    public static void main(String[] args) {
        int[] arr = {1,15,25,45,42,21,17,12,11};
        System.out.println(bitonic(arr,arr.length));
    }

    static int bitonic(int[] arr, int n){
        int start = 0, end = n;

        while(start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1])
                end = mid;
            else
                start = mid+1;
        }

        return arr[start];
    }
}
