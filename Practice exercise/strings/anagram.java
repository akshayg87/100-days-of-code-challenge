//Anagram
import java.util.Arrays;

public class anagram {
    public static void main(String[] args){
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";
        System.out.println(isAnagram(a,b));
    }

    static boolean isAnagram(String a, String b){
        int p = a.length();
        int q = b.length();
        if (p==q)
        {
            char[] a1 = a.toLowerCase().toCharArray();
            char[] b1 = b.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
            return Arrays.equals(a1, b1);
        }
        else return false;
    }
}
