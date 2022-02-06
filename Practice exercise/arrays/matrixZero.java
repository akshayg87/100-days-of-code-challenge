import java.util.Arrays;

public class matrixZero {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        setZeroes(mat);
        System.out.println(Arrays.toString(mat));
    }
    static void setZeroes(int[][] matrix) {

        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        int i , j;

        // Mark which row and column you want to make zero
        // Don't try to do it recursively at the same time otherwise you will endup making every thing 0 like a ripple effect

        for(i = 0; i < row.length; i++) {
            for(j = 0; j < col.length; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1; //this row to be made 0
                    col[j] = 1; //this col to be made 0
                }
            }
        }


        for(i = 0; i < row.length; i++) {
            if(row[i] == 1) {
                //make this whole row zero
                for(j = 0; j < col.length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }


        for(j = 0; j < col.length; j++) {
            if(col[j] == 1) {
                //make this whole column zero
                for(i = 0; i < row.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
