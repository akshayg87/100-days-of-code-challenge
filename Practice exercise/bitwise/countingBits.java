package bitwise;

import java.util.Arrays;

public class countingBits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }

    static int[] countBits(int n)
    {
    int[] arr = new int[n+1];
    for(int i=0; i<=n; i++) {
        arr[i] = countOne(i);
    }
    return arr;
    }

    static int countOne(int i)
    {
        int count = 0;
        while(i!=0)
        {
            int r = i & -i;
            i -= r;
            count++;
        }

        return count;
    }

}
