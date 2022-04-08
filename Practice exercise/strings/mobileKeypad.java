//Convert a sentence into its equivalent mobile numeric keypad sequence
import java.lang.String;
public class mobileKeypad {
    public static void main(String[] args) {
        String s = "HEY U";
        System.out.println(keypadConvert(s));
    }

    static String keypadConvert(String s){
        int[] key = {2,22,222,3,33,333,4,44,444,5,55,555,6,66,666,7,77,777,7777,8,88,888,9,99,999,9999};
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == ' ') ans.append("0");
            else{
                int chr = s.charAt(i);
                int keypad = chr - 65;
                ans.append(key[keypad]);
            }
        }
        return ans.toString();
    }
}
