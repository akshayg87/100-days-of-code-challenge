public class matrixrotation {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,1}};
        int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat,target));
    }
     static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {    //because rotation will be done 3 times
            mat = rotate(mat);     //first rotate
            if(check(mat, target))    //then check
                return true;     //if true, then return
        }
        return false;
    }
    static boolean check(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
            {
                if (mat[i][j] != target[i][j])   //normal comparison
                    return false;
            }
        }
        return true;
    }
    static int[][] rotate(int[][] mat) {
        int col = mat.length - 1;    //getting length of column
        int[][] n = new int[col + 1][col + 1];   //declaring new 2D array of mat size
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                n[j][col] = mat[i][j];    //putting row wise values of mat to column wise places in new array
            }
            col--;    //decreasing the column length
        }
        return n;
    }
}
