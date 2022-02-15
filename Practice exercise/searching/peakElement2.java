import java.util.Arrays;

public class peakElement2 {
    public static void main(String[] args) {
        int[][] m = {{1,4},{3,2}};
        System.out.println(Arrays.toString(peak(m)));
    }

    static int[] peak(int[][] m)
    {
        int k = m.length;
        int k1 = m[0].length;
        int p = m[0][0];
        int f = 0;
        int g = 0;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k1; j++) {
                if (m[i][j] > p) {
                    p = m[i][j];
                    f = i;
                    g = j;
                }
            }
        }

        int[] a = new int[2];
        a[0] = f;
        a[1] = g;
        return a;
    }
}
