package strings;

public class mergeStrings {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";

        System.out.println(merge(word1, word2));
    }

    static String merge (String word1, String word2)
    {
        StringBuilder sb = new StringBuilder();
        int len = Math.max(word1.length(), word2.length());

        for(int i=0; i<len; i++){
            if(i < word1.length())
                sb.append(word1.charAt(i));
            if(i < word2.length())
                sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}
