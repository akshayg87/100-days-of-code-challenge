package strings;

public class haystackNeedle {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "o";
        System.out.println(strStr(haystack,needle));
    }

    static int strStr(String haystack, String needle) {

        if(needle.length() > haystack.length()){
            return -1;
        }

        if(needle.length() == 0){
            return 0;
        }

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
