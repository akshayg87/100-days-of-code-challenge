package bitwise;

public class hammingDistance {
    public static void main(String[] args) {
        int x = 0;
        int y = 11;
        System.out.println(Count(x,y));
    }

    static int Count(int x, int y)
    {
        int res = 0;
        for(int i=0; i<32; i++){
         if (((x>>i)&1) != ((y>>i)&1))
             res++;
        }

        return res;
    }
}
