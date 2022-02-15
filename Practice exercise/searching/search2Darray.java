public class search2Darray {
    public static void main(String[] args) {
        int[][] m ={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 13;
        System.out.println(search(m,target));
    }

    static boolean search(int[][] matrix, int target)
    {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = 0;
        int col = matrix[0].length - 1;

        while (row <= col){
            if (matrix[row][col] == target) {
                return true;
            }

            else if (matrix[row][col] < target)
                row++;

            else
                col--;
        }

        return false;
    }
}
