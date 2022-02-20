package math;

import java.util.Arrays;

public class maxThree {
    public static void main(String[] args) {
        int[] n = {5, 2, 3, 4, 1};
        System.out.println(Product(n));
    }

    static int Product(int[] n)
    {
        int p = 1;
        int count = 3;
        Arrays.sort(n);

        for (int i = n.length-1; i > 0; i--) {
            p *= n[i];
            count--;
            if (count==0)
                return p;
        }
        return p;
    }
}