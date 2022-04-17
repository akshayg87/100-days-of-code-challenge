//Trapping Rain Water
public class trapRain {
    public static void main(String[] args) {
        int[] arr = {3,0,0,2,0,4};
        System.out.println(trappingWater(arr,arr.length));
    }

    static long trappingWater(int[] arr, int n) {
        int[] r = new int[n];
        int[] l = new int[n];
        long ans = 0;
        l[0] = arr[0];
        r[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            l[i] = Math.max(l[i - 1], arr[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            r[i] = Math.max(r[i + 1], arr[i]);
        }
        for (int i = 0; i < n; i++) {
            ans += (Math.min(r[i], l[i]) - arr[i]);
        }
        return ans;
    }
}