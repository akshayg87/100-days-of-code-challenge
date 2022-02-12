package bitwise;

public class reduceNum {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(count(n));
    }

    static int count(int num)
    {
        int count = 0;
        while(num>0)
        {
           if ((num&1) == 1)
               num = num-1;
           else
             num>>=1;

           count++;

        }

        return count;
    }
}
