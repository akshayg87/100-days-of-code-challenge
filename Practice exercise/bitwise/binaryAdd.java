package bitwise;

public class binaryAdd {
    public static void main(String[] args)
    {
        String a = "0110";
        String b = "0010";
        System.out.println(Add(a,b));
    }

    static StringBuilder Add(String a, String b)
    {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i>=0 || j>=0)
        {
            int sum = carry;
            if (i>=0)
                sum += a.charAt(i--) - '0';

            if(j>=0)
                sum += b.charAt(j--) - '0';
            //subtract by '0' to convert the numbers from a char type into an int, so we can perform operations on the numbers

            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        res.reverse();

        return res;
    }
}
