//Run Length Encoding
public class lengthEncoding {
    public static void main(String[] args) {
        String s = "abbbcdddd";
        System.out.println(encode(s));
    }

    static String encode(String s){
        String res = "";
        int len = 1, i;

        for (i=1; i<s.length(); i++){
            if (s.charAt(i-1) == s.charAt(i)){
                len++;
            }
            else {
                res += s.charAt(i-1);
                res += len;
                len = 1;
            }
        }
        res += s.charAt(i-1);
        res += len;
       return res;
    }
}
