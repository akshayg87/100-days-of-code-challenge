package strings;

public class longestPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(Prefix(str));
    }

    static String Prefix(String[] strs)
    {
        if(strs.length==0)
            return "";

        String prefix = strs[0];
        for (int k = 0; k < strs.length; k++) {
            String s = strs[k];
            int i = 0, j = 0;
            while (i < prefix.length() && j < s.length() && prefix.charAt(i) == s.charAt(j)) {
                i++;
                j++;
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;}
}
