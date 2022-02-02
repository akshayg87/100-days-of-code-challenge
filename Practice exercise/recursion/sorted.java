package recursion;

public class sorted {
    public static void main(String[] args) {
        int[] arr = {12,2,3};
        int n = arr.length;
        if (sort(arr, n) != 0)
            System.out.println("No");
        else
            System.out.println("Yes");
    }

    static int sort(int[] arr, int n)
    {
        if (n==1 || n==0)
            return 0;

        if (arr[n-1] < arr[n-2])
            return 1;

        return sort(arr, n-1);
    }
}
