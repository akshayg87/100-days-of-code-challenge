package strings;

public class equivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(equal(word1, word2));
    }

    static boolean equal(String[] word1, String[] word2) {
        String word1String = "";
        String word2String = "";

        for (String word : word1)
            word1String = word1String + word;

        for (String word : word2)
            word2String = word2String + word;

        return (word1String.equals(word2String));
    }
}
