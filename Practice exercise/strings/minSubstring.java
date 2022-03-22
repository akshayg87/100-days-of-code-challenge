//Minimum times A has to be repeated such that B is a substring of it
public class minSubstring {
    public static void main(String[] args){
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(subCount(a,b));
    }


    static int subCount(String A, String B) {
        int count = 1;
        int i = 0, j = 0;
        while(i<A.length())
        {
            if(A.charAt(i)==B.charAt(j))
            {
                if(i+1<A.length())
                {
                    if(A.charAt(i+1)==B.charAt(j+1)) break;
                }
                else if(A.charAt(0)==B.charAt(j))
                {
                    break;
                }
            }
            i++;
        }
        while(j<B.length())
        {
            if(i==A.length())
            {
                count++;
                i = 0;
            }
            if(A.charAt(i)==B.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                return -1;
            }
        }
        return count;
    }
}
