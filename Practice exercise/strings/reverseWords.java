package strings;

public class reverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverse(s));
    }

    static String reverse(String s)
    {
        //Create a stringbuilder from the input string e.g -> Let's take LeetCode contest
        StringBuilder stringBuilder = new StringBuilder(s);
//        reverse the whole string to -> tsetnoc edoCteeL ekat s'teL
        stringBuilder.reverse();
//        split using spaces to create an array of the reversed string->  [tsetnoc, edoCteeL, ekat, s'teL]
        String[] strings = stringBuilder.toString().split(" ");
//        remove all the characters from the initial stringBuilder ->
        stringBuilder.delete(0,stringBuilder.length());
//        iterate over the array backwards adding the words into the string builder
        for (int i = strings.length -1 ; i >= 0 ; i--) {
            stringBuilder.append(strings[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
