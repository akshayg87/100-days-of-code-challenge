//Valid Pair Sum
public class validPairSum {
    public static void main(String[] args) {
        int[] arr = {-1, -1, -1, 0};
        System.out.println(isValidSum(arr,arr.length));
    }

    static int isValidSum(int[] arr, int n){
        int count=0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (sum>0 && i!=j){
                    count++;
                }
            }
        }

        return count;
    }
}
