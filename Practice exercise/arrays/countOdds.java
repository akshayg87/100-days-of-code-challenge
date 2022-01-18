public class countOdds {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices  = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int countOdds = 0;

        for(int i = 0 ; i < indices.length; i++) {

            for(int j = 0;j < n;j++)
                matrix[indices[i][0]][j] += 1;

            // indices[i][0] represent first cell of every row of  indices
            // so first cell of indices represent which row of matrix
            // we want to increment
            //using [j] we are traversing every column of matrix

            for(int k = 0;k<m;k++)
                matrix[k][indices[i][1]] += 1;
        }
        // indices[i][1] represent 2nd cell of every row of indices
        // so 2nd cell of indices represent which column of matrix
        // we want to increment
        // using [k] we are traversing every row of matrix

        for(int i = 0;i < m;i++)
            for(int j = 0;j < n;j++)
                if(matrix[i][j]%2 != 0)
                    countOdds+=1;

        return countOdds;

    }
}
