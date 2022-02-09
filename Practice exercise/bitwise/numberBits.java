package bitwise;

public class numberBits {
    public static void main(String[] args) {
        int n = 00000000000000000001101;
        System.out.println(count(n));
    }

    static int count(int n)
    {
        int count = 0;
        for(int i=0; i<32; i++){
            int p = n>>i;
            if ((p&1) == 1)
                count++;
        }
        return count;
    }
}
