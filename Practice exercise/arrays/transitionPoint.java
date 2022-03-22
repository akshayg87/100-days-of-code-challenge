public class transitionPoint {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {0,0,0,1,1};
        System.out.println(transition(N,arr));
    }

    static int transition(int n, int[] arr) {
        if (n == 0)
            return -1;

        if (n == 1) {
            if (arr[1] == 1)
                return 0;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
                return i;
        }
        return -1;
    }
}