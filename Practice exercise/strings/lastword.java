public class lastword {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(len(s));
    }

    static int len(String s)
    {
        String[] sentence = s.split(" ");

        String last = sentence[sentence.length-1];

        return last.length();
    }
}
