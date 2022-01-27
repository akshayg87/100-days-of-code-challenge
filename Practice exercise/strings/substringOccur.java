package strings;

public class substringOccur {
    public static void main(String[] args) {
        String[] patterns = {"a","b","c"};
        String word = "aaaaabbbbb";
        System.out.println(substring(patterns,word));
    }

    static int substring(String[] patterns, String word)
    {
        int count=0;
        for (int i = 0; i < patterns.length; i++) {
            String s = patterns[i];
            if (word.contains(s))
                count++;
        }
        return count;
    }
}
