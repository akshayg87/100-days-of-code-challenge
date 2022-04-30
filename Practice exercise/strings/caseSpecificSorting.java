//Case-specific Sorting of Strings

import java.util.ArrayList;
import java.util.Collections;

public class caseSpecificSorting {
    public static void main(String[] args) {
        String str = "srbDKi";
        System.out.println(caseSort(str,str.length()));
    }

    static String caseSort(String str, int n){
        ArrayList<Character> lower = new ArrayList<>();
        ArrayList<Character> upper = new ArrayList<>();

        for (char ch : str.toCharArray()){
            if (ch>='a' && ch<='z')
                lower.add(ch);
            else
                upper.add(ch);
        }

        Collections.sort(lower);
        Collections.sort(upper);

        String res = "";
        int i=0, j=0;

        for (int k=0; k<n; k++){
            char ch = str.charAt(k);
            if (ch>='a' && ch<='z') {
                res += lower.get(i);
                i++;
            }
            else {
                res += upper.get(j);
                j++;
            }
        }
        return res;
    }
}
