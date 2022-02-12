package bitwise;

public class xorOperation {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        System.out.println(Opr(n,start));
    }

    static int Opr(int n, int start)
    {
    int xor = 0;
        for (int i = 0; i < n; i++) {
            int x = start + (2*i);
            xor ^= x;
        }
    return xor;
    }
}
