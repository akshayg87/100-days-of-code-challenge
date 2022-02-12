package bitwise;

public class alternateBits {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(alternate(n));
    }

    static boolean alternate(int n)
    {
        int prev = n&1;
        n = n>>1;

        while(n>0){
            int temp = n&1;
            if(prev == temp)
                return false;

            prev = temp;
            n = n>>1;
        }
        return true;
    }
}
