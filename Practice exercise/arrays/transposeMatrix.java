public class transposeMatrix {
    static int[][] transpose(int[][] mat)
    {
        int m = mat.length;
        int n = mat[0].length;
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[j][i] = mat[i][j];
            }
        }
        return a;
    }

}
