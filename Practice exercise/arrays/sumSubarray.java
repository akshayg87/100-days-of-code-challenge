//Sum of Subarrays

public class sumSubarray {
    public static void main(String[] args) {
        long[] arr = {1,2,3};
        System.out.println(subarraySum(arr,arr.length));
    }

    static long subarraySum(long[] arr, int n){
        long ans = 0, mod = 1000000007;
        for (int i = 0; i < n; i++) {
            ans = (ans + (arr[i]*(n-i)*(i+1))%mod);
        }
        return ans%mod;
    }
}
