//Maximum Index
public class maxIndex {
    public static void main(String[] args){
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxDiffIndex(arr,arr.length));
    }

    static int maxDiffIndex(int[] arr, int n){
        int maxdiff = 0;
        for (int i = 0; i < n; i++) {
            int j = n-1;
            while (j>i){
                if (arr[i]<=arr[j]){
                    int diff = j-i;
                    maxdiff = Math.max(diff,maxdiff);
                    break;
                }
                j--;
            }
        }
        return maxdiff;
    }
}
