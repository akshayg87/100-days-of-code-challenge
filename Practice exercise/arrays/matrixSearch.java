//Search in a matrix
public class matrixSearch {
    public static void main(String[] args) {
        int[][] mat = {
                {3, 30, 38},
                {44, 52, 54},
                {57, 60, 69}
        };
        System.out.println(find(mat,mat.length,42));

    }

    static boolean find(int[][] mat, int n, int x){
        int row = 0;
        int col = n-1;
        while(row<n && col>=0){
            if (mat[row][col] == x)
                return true;
            if (mat[row][col] < x)
                row++;
            else
                col--;
        }
        return false;
    }
}
