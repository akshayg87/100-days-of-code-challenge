package strings;

public class validPalindrome2 {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(Palin(s));
    }


    static boolean Palin(String s)
    {

        int left =0;//putting at index first
        int right= s.length()-1;//putting pointer at laft index
        while(left<right) {
            //checking the condition when left is not equal to right
            if (s.charAt(left) != s.charAt(right)) {
                //checking subarry from index right-1 and left+1 is equal or not
                return validSubPalindrome(s, left, right - 1) || (validSubPalindrome(s, left + 1, right));
            }
            left++; right--;
        }
        return true;
    }

    static boolean validSubPalindrome(String s, int lo, int hi) {
        while(lo < hi){
            if (s.charAt(lo) != s.charAt(hi)){
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
}
