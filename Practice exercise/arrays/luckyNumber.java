import java.util.ArrayList;
import java.util.List;

public class luckyNumber {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9},
        };

        System.out.println(luckyNumbers(mat));
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for(int row = 0; row < matrix.length; row++){
            int col = smallest(matrix,row);
            int value = matrix[row][col];
            if (greater(matrix, col , value)) {
                ans.add(value);
            }
        }
        return ans;
    }
    public static int smallest(int[][] matrix , int row){ // searching smallest in rows
        int index = 0;
        int small = Integer.MAX_VALUE;
        for(int i=0 ; i<matrix[row].length; i++){
            if(matrix[row][i] < small){
                small = matrix[row][i];
                index = i;
            }
        }
        return index;
    }
    public static boolean greater(int[][] matrix , int col , int val){ // checking greater or not
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][col] > val){
                return false;
            }
        }
        return true;
    }
}
