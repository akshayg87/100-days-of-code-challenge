//Overlapping Intervals

import java.util.Arrays;
import java.util.LinkedList;

public class overlappingIntervals {
    public static void main(String[] args){
        int[][] interval = { {1,3},{2,4},{6,8},{9,10} };
        int[][] res = overlappedInterval(interval);
        for (int i = 0; i < interval.length; i++) {
            for (int j = 0; j < interval[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] overlappedInterval(int[][] Intervals)
    {
        Arrays.sort(Intervals, (a, b)-> a[0]-b[0]);
        LinkedList<int[]> merged = new LinkedList<>();
        for(int i=0; i<Intervals.length; i++)
        {
            if(merged.isEmpty() || merged.getLast()[1] < Intervals[i][0])
            {
                merged.add(Intervals[i]);
            }
            else
            {
                merged.getLast()[1] = Math.max(merged.getLast()[1], Intervals[i][1]);
            }
        }
        int[][] res = new int[merged.size()][2];
        return merged.toArray(res);
    }
}
