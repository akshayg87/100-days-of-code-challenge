package recursion;


public class reverseString {
    public static void main(String[] args) {
        char[] str = {'w','o','r','d'};
        reverse(str);
        System.out.println(str);
    }

    static void reverse(char[] s)
    {
        int i =0;
        int n = s.length-1;
        swap(s, i, n);
    }

    static void swap(char[] s, int i, int n) {
        if (n > 1) {
            char temp = s[i];
            s[i] = s[n];
            s[n] = temp;
            swap(s, i+1, n-1);
        }

    }
}
