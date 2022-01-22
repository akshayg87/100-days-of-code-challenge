package sorting;


public class thirdMax {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 10, 8};
        bubbleSort(arr);
        System.out.println("Third distinct max is = " + max(arr));
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

    static int max(int[] arr)
    {
        int n = arr.length;
        int temp = 0;

        if (n<=2)
            return arr[n-1];
        if (n==3)
        {
            boolean flag = true;
            if (arr[0] == arr[1] || arr[1] == arr[2])
                return arr[2];
        }

        int i;
        for (i = 0; i < n-1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[temp++] = arr[i];
            }
        }
        arr[temp++] = arr[i];

        if (temp<=2)
            return arr[temp-1];

        return arr[temp-3];

        }

}

