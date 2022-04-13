//Predict the Column
public class findColumn {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0},
                       {1, 1, 0},
                       {1, 1, 0}};
        System.out.println(columnWithMaxZeros(arr, arr.length));
    }

    static int columnWithMaxZeros(int[][] arr, int N)
    {

        int minSum=Integer.MAX_VALUE;
        int colnum=0;
        for(int i=0;i<N;i++)        // column
        {
            int colsum=0;
            for(int j=0;j<N;j++)    //row
                colsum+=arr[j][i];

            if(colsum==0)
                return i;

            if(colsum<minSum)
            {
                minSum=colsum;
                colnum=i;
            }
        }
        return colnum;
    }
}