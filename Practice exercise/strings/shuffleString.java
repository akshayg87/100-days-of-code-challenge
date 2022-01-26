package strings;

import java.util.Arrays;

public class shuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(shuffle(str,arr));
    }

    static String shuffle(String str, int[] arr)
    {
        int len = str.length();
        char[] ch = new char[len];

        for (int i = 0; i < len; i++) {
            int idx = arr[i];
            ch[idx] = str.charAt(i);
        }

        return new String(ch);
    }
}
