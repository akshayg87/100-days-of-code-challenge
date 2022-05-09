//Rotate String

import java.util.ArrayList;

public class rotateString {
    public static void main(String[] args) {
        String s = "abcdefg";
        int n = 7, q = 5;
        int[] q1 = {1 ,2, 2, 1, 2};
        int[] q2 = {2,0,6,4,1};
        System.out.println(StringQuery(n,q,s,q1,q2));
    }
    static ArrayList<Character> StringQuery(int N, int Q, String S, int[] Q1, int[] Q2) {

        ArrayList<Character> ans = new ArrayList<>();
        int res = 0;
        for(int i = 0;i<Q;i++){
            if(Q1[i] == 1){
                res += N - (Q2[i])%N;
            }
            else ans.add(S.charAt((Q2[i] + res)%N) );
        }

        return ans;

    }
}
