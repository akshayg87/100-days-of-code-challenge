package strings;

public class binaryOnes {
    public static void main(String[] args) {
        String s = "1011";
        System.out.println(binary(s));
    }

    static boolean binary(String s)
    {

    // return !s.contains("01"); - Also correct & shortcut
        int i=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
                break;
        }
        for(int j=i;j<s.length();j++)
        {
            if(s.charAt(j)=='1')
                return false;
        }
        return true;

    }
}
