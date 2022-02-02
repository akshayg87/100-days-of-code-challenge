package recursion;


import java.util.Arrays;

public class paranthesisCheck {
    public static void main(String[] args) {
        char[] exp = "[()]".toCharArray();
        int n=exp.length;
        if (check(exp, n))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    static char findClosing(char c)
    {
        if (c== '(')
            return ')';
        if (c== '{')
            return '}';
        if (c== '[')
        return ']';
        return Character.MIN_VALUE;
    }

    static boolean check(char[] exp, int n)
    {
        if (n==0)
            return true;
        if (n==1)
            return false;

        if (exp[0] == ')' || exp[0] == '}' || exp[0] == ']')
            return false;

        char closing = findClosing(exp[0]);

        int i, count = 0;
        for (i = 1; i < n; i++) {
            if (exp[i] == exp[0])
                count++;
            if (exp[i] == closing){
                if (count == 0)
                    break;
                count--;
            }
        }

        if (i==n)
            return false;

        if (i==1)
            return check(Arrays.copyOfRange(exp, i+1, n), n-2);

        return check(Arrays.copyOfRange(exp, 1, n), i-1) && check(Arrays.copyOfRange(exp, i+1, n), n-i-1);

    }
}
