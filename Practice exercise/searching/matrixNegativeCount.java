package search;

public class matrixNegativeCount {
    public static void main(String[] args) {
        int[][] mat = {
                {-20, -18, -15},
                {0, 1, 5},
                {6, 8, 10}
        };
        System.out.println(countNegatives(mat));
    }


    static int countNegatives(int[][] grid) {
        int row=0;     //initially we will be at the first meaning the 0th row.
        int end=grid[row].length-1;  //This end represents the last index of a row.
        int count=0; //This is the counter that will count the negative numbers
        while(row<grid.length && end>=0) 	//We will run the loop till we have reached the last row and till the end pointer has reached the first index of the particular row.
        {
            if(grid[row][0]< 0 )           //If the first index element is negative then that automatically means all the
            //numbers to the right of it are negative since array is sorted in descending order.
            {
                count=count+grid[row].length;    //This means that the count will have the number of elements present
                //in that row since all are negative.

                row++;    //Now we've counted the negative numbers here so lets move onto the next row
            }

            else if(grid[row][end]<0)   //Checking if the last index element is negative. If it is then that means there
            //maybe some elements to the left of it.

            {    count++;    //Since we found one element at the last index so that means count should be incremented
                //by one.
                end--;   //but we also have to look at the remaining elements so decrease the end pointer to the second
                //last element now. From here the loop will run again. And also here is the reason why in the while loop
                //i
                //have given the condition end>=0 since if we reach end=0 and that number is also negative this will
                //do
                //end-- and that will be array out of bound exception.

            }
            else {
                end=grid[row].length-1;       //Here if we dont find the number at the end index to be negative then
                //put the end index to the last index value of the row FOR THE NEXT ROW.
                row++;   //Move on to the next row.

            }
        }  return count;        //whatever the value of count is , will be returned.
    }
}
