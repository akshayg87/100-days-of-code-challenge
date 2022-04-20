//Longest Distinct characters in string
public class longestDistinct {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubsttr(s));
    }

    static int longestUniqueSubsttr(String str)
    {
        int n = str.length();

        // Result
        int res = 0;

        for(int i = 0; i < n; i++)
            for(int j = i; j < n; j++)
                if (areDistinct(str, i, j))
                    res = Math.max(res, j - i + 1);

        return res;
    }

    static Boolean areDistinct(String str,
                               int i, int j)
    {

        // Note : Default values in visited are false
        boolean[] visited = new boolean[26];

        for(int k = i; k <= j; k++)
        {
            if (visited[str.charAt(k) - 'a'])
                return false;

            visited[str.charAt(k) - 'a'] = true;
        }
        return true;
    }
}
