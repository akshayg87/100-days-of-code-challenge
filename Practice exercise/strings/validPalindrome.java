package strings;

public class validPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        char[] z = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "").toCharArray();
        for(int i=0; i<z.length/2; i++){
            if(z[i]!=z[z.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
