package bitwise;

public class nonRepeating {
    public static void main(String[] args) {
        int[] arr = {12, 1, 3, 12, 1, 2, 3};
        System.out.println(repeat(arr));
    }

    static int repeat(int[] arr)
    {
        int unique = 0;
        for (int n : arr)
        {
            unique ^= n;
        }

        return unique;
    }
}
