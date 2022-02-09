package bitwise;

public class evenOdd {
    public static void main(String[] args)
    {
        int n = 13;
        System.out.println(isEven(n));
    }
    static boolean isEven(int n)
    {
        return (n & 1) != 1;
    }
}
