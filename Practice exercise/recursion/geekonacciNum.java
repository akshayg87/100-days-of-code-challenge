package recursion;

public class geekonacciNum {
    public static void main(String[] args) {
        System.out.println(geek(1, 3, 2, 6));
    }

    static int geek(int A, int B, int C, int N)
    {
        int[] arr = new int[N];
        arr[0]=A;
        arr[1]=B;
        arr[2]=C;

        for (int i = 3; i <N; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        return arr[N-1];

    }
}
