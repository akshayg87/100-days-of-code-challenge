package sorting;

public class maxProduct {
    public static void main(String[] args) {
        int[] arr = {8,7,5,3,2,1};
        bubbleSort(arr);

        System.out.println(product(arr));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static int product(int[] arr) {
        int max = 0;
        int i = arr.length - 1;
        int x = arr[i];
        int y = arr[i - 1];
        int z = arr[i-2];

        max = x*y*z;
        return max;

     }
}
