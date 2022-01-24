package sorting;

public class avgSalary {
    public static void main(String[] args) {
        int[] arr = {1000,2000,3000};
        System.out.println(Salary(arr));
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

    static int Salary(int[] arr)
    {
        int sal = 0;
        bubbleSort(arr);
        int n = arr.length-2;

        for (int i = 1; i <= arr.length-2 ; i++) {
            sal = sal + arr[i];
        }

        return sal/n;
    }
}
