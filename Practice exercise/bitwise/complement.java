package bitwise;

public class complement {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(complementNo(n));
    }

    static int complementNo(int num)
    {
        int x=num,y=0;
        while(x!=0)
        {
            x=x>>1;
            y=y<<1;
            y=y+1;

        }
        return num^y;
    }
}
