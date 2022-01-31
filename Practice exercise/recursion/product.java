package recursion;

public class product {
    public static void main(String[] args) {
        int x = 5, y = 2;
        int num = pro(x, y);
        System.out.println(num);
    }

    static int pro(int x, int y)
    {
        // if x is less than
        // y swap the numbers
        if (x < y)
            return pro(y, x);

            // iteratively calculate
            // y times sum of x
        else if (y != 0)
            return (x + pro(x, y - 1));

            // if any of the two numbers is
            // zero return zero
        else
            return 0;
    }

}
