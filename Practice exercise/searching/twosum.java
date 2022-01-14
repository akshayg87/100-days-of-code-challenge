package search;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] n = { 1,2,3,5,7};
        int target = 10;
        System.out.println(Arrays.toString(sum(n,target)));
    }

    static int[] sum(int[] n , int target)
    {
        int start = 0, end = n.length-1;
        int[] res = new int[n.length];

        while(start<=end) {
        if (n[start]+n[end]<target){
            start++;
        }
        else if (n[start]+n[end]>target){
            end--;
        }
        else
            res[0]=start+1;
            res[1]=end+1;
            return res;
        }
        return res;
    }
}
