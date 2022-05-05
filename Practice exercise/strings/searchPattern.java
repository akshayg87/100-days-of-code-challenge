//Search Pattern (Rabin-Karp Algorithm)

import java.util.ArrayList;

public class searchPattern {
    public static void main(String[] args){
        String txt = "btmanandrobinarebat";
        String pat = "bat";
        System.out.println(searchPat(txt,pat));
    }

    static ArrayList<Integer> searchPat(String txt, String pat){
        ArrayList<Integer> res = new ArrayList<>();
        int n = pat.length();
        for (int i = 0; i <= txt.length()-n; i++) {
            if (pat.equals(txt.substring(i,i+n)))
                res.add(i+1);
        }
        if (res.isEmpty())
            res.add(-1);
        return res;
    }
}
