import java.util.Stack;

public class validParanthesis {
    public static void main(String[] args) {
        String s = "()[";
        System.out.println(valid(s));
    }

    static boolean valid(String s)
    {
        Stack<Character> st = new Stack<>();

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c=='(' || c=='[' || c=='{')
                st.push(c);

            else if (st.empty())
                return false;

            else if ((c==')' && st.peek()=='(') || (c==']' && st.peek()=='[') || (c=='}' && st.peek()=='{'))
                st.pop();
            else
                return false;
        }

        return st.empty();
    }
}
