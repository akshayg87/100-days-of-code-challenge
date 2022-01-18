public class diagonalSum {

    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1},
                {1, 1,1},
                {1, 1, 1}};
        System.out.println(diagonalSum(mat));
    }
//    There are three cases that we have to consider
//    1. Matrix has only one row and one column i.e. n=1
//    In this case the sum is the value itself i.e. mat[0][0]
//    2. Matrix has even rows and columns  i.e. n is even
//    In this case we can ignore any overlap in the primary and secondary diagonals
//    3. Matrix has odd rows and colums  i.e. n is odd (n!=1)
//    In this case one element will be common between the primary and secondary diagonals i.e. the center element

    static int diagonalSum(int[][] mat) {
        if (mat.length == 1) {
            return mat[0][0]; // CASE 1
        } else {
            int pri = 0, sec = 0, j = 0, k = mat.length - 1;
            // case 2 and  case 3
            for (int i = 0; i < mat.length; i++) {
                pri = pri + mat[i][j]; // counter 'j' will move from top left corner to bottom right corner
                if (j != k) // (case 3)This check will avoid us adding the center element if present
                    sec = sec + mat[j][k]; // counter 'k' will move from top right corner to bottom left corner
                j++;
                k--;
            }
            return (pri + sec);
        }

    }
}
