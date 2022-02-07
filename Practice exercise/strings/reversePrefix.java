public class reversePrefix {
    public static void main(String[] args)
    {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reverse(word, ch));
    }

    static String reverse(String word, char ch)
    {
        int end = word.indexOf(ch);
        int len = word.length();

        StringBuilder prefix = new StringBuilder(word.substring(0, end+1));
        prefix.reverse();

        StringBuilder endPart = new StringBuilder(word.substring(end+1, len));

        return prefix.append(endPart).toString();

    }
}
