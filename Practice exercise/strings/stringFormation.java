//String formation from substring

public class stringFormation {
    public static void main(String[] args) {
        String s = "ababb";
        System.out.println(isRepeat(s));
    }

    static int isRepeat(String s)
    {
        int n = s.length();
        int[] lps = new int[n];
        lps[0] = 0;

        int i = 0, j = 1;

        while(j < n)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                lps[j] = i + 1;
                i++;
                j++;
            }
            else
            {
                if(i == 0)
                {
                    lps[j] = 0;
                    j++;
                }
                else
                {
                    i = lps[i - 1];
                }
            }
        }

        return (lps[n - 1] > 0 && n % (n - lps[n - 1]) == 0) ? 1 : 0;
    }
}
