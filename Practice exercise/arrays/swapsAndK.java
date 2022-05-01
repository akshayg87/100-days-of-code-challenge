//Minimum swaps and K together

public class swapsAndK {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 8, 7, 4};
        int k = 6;
        System.out.println(minSwap(arr,arr.length,k));
    }
static int minSwap(int arr[], int n, int k) {
    int w = 0, h = 0;
    for (int i = 0; i < n; i++) if (arr[i] <= k) w++;
    for (int i = 0; i < w; i++) if (arr[i] > k) h++;
    int min_h = h;
    for (int i = 0; i + w < n; i++) {
        if (arr[i] > k) h--;
        if (arr[i + w] > k) h++;
        min_h = Math.min(min_h, h);
    }
    return min_h;
}
}
