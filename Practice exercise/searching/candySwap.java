import java.util.Arrays;

public class candySwap {
    public static void main(String[] args) {
        int[] aliceCandies = {2};
        int[] bobCandies = {1,3};

        System.out.println(Arrays.toString(swap(aliceCandies,bobCandies)));
    }


    static int[] swap(int[] aliceCandies, int[] bobCandies)
    {
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i < aliceCandies.length; i++) {
            sum1 += aliceCandies[i];
        }

        for (int i = 0; i < bobCandies.length; i++) {
            sum2 += bobCandies[i];
        }

        int diff = (sum1 - sum2)/2;

        int[] res = new int[2];
        for (int i = 0; i < aliceCandies.length; i++) {
            for (int j = 0; j < bobCandies.length; j++) {
                if (aliceCandies[i] == bobCandies[j] + diff){
                    res[0] = aliceCandies[i];
                    res[1] = bobCandies[j];
                }
            }
        }
        return res;
    }
}
