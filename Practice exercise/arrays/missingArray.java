public class missingArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5};
        int n = arr.length+1;
        int ans = missing(arr, n);
        System.out.println(ans);
    }

    static int missing(int[] array, int n){
        int sum=(n*(n+1))/2;
        for(int i=0;i<array.length;i++)
            sum=sum-array[i];

        return sum;
    }
}
