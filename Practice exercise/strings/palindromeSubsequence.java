//Palindromic Subsequences
public class palindromeSubsequence {
    public static void main(String[] args) {
        String S = "100101";
        int N = S.length();
        System.out.println(minSubsequence(N,S));
    }

    static int minSubsequence(int n, String s){
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i)!=s.charAt(n-i-1)){
                return 2;
            }
        }
        return 1;
    }
}
