//Reverse words in a given string
public class reverseWords {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reversewords(S));
    }

    static String reversewords(String S)
    {
        String[] s=S.split("\\.");
        String rev="";
        for(int i=s.length-1;i>=0;i--)
        {
            rev=rev+s[i]+".";
        }
        return rev.substring(0,rev.length()-1);

    }
}
