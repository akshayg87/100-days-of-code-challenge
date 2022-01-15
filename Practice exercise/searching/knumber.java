package search;

public class knumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }

    static int findKthPositive(int[] arr, int k)
    {
        if (k<arr[0])
            return k;
        int mid,low=0,high=arr.length;
        while (low<high)
        {
            mid=low+(high-low)/2;
            if (arr[mid]-mid-1<k)
                low=mid+1;
            else high=mid;
        }
        return low+k;
    }
}