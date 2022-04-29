//Row with max 1s

public class maxOnes {
    public static void main(String[] args) {
        int N = 4 , M = 4;
        int[][] Arr =
            {{0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}};
        System.out.println(rowWithMaxOne(Arr,N,M));
    }

    static int rowWithMaxOne(int[][] arr, int n, int m){
        int index=-1;
        int x=0;

        for(int i=m-1;i>=0;i--){
            if(arr[x][i]==1){
                index=x;
            }
            else{
                if(x<n-1){
                    i++;
                    x++;}
            }
        }

        return index;
    }
}
