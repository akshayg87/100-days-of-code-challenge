package math;

public class binaryAdd {
    public static void main(String[] args)
    {
        String a = "11";
        String b = "1";
        System.out.println(Add(a,b));
    }

    static StringBuilder Add(String a, String b)
    {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i>=0 || j>=0)
        {
            int sum = carry;

            if (i>=0)
                sum += a.charAt(i--) - '0';

            if (j>=0)
                sum += b.charAt(j--) - '0';

            carry = sum > 1 ? 1:0;
            res.append(sum%2);
        }
        res.reverse();
        return res;
    }
}
