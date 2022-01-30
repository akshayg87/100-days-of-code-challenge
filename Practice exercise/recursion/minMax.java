package recursion;

public class minMax {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 56, 10000, 167};
        int n = arr.length;
        System.out.println("Minimum = " +getMin(arr, 0 , n));
        System.out.println("Maximum = " +getMax(arr, 0 , n));

    }

    static int getMin(int[] arr, int i, int n)
    {
        return (n == 1) ? arr[i] : Math.min(arr[i], getMin(arr,i + 1 , n - 1));
    }

    static int getMax(int[] arr, int i, int n)
    {
        return (n == 1) ? arr[i] : Math.max(arr[i], getMax(arr, i+1 ,n-1));
    }
}
