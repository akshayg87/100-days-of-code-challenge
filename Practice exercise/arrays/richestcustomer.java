package arrays;

public class richestcustomer {
    public static void main(String[] args) {
        int[][] accounts = {{1,20,3}, {4,5,1}};
        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] acc) {
        int max=0;
        for (int i = 0; i < acc.length; i++) {
            int  sum=0;
            for (int j = 0; j < acc[i].length; j++) {
                sum += acc[i][j];
            }
           max = Math.max(sum, max);
        }
        return max;

    }
}
