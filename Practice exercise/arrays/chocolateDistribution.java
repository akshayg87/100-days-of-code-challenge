//Chocolate Distribution Problem
import java.util.ArrayList;
import java.util.Collections;

public class chocolateDistribution {
    public static void main(String[] args) {
        int N = 8, M = 5;
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(4);
        A.add(1);
        A.add(9);
        A.add(56);
        A.add(7);
        A.add(9);
        A.add(12);
        System.out.println(findMinDiff(A,N,M));
    }

    static long findMinDiff (ArrayList<Integer> a, long n, long m)
    {
        Collections.sort(a);
        long ans = a.get((int)m-1)-a.get(0);

        for(int i = (int)m; i<(int)n; i++){
            long min = a.get(i-(int)m+1);
            long max = a.get(i);
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
}
