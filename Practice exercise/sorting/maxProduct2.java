package sorting;

public class maxProduct2 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6};
        System.out.println(Product(arr));
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

    static int Product(int[] arr)
    {
        int product;
        bubbleSort(arr);
        product = (arr[arr.length-1]-1) * (arr[arr.length-2]-1);
        return product;
    }
}

