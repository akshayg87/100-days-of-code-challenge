package strings;

public class intMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(map(s));
    }

    static String map(String s)
    {
        String ans =""; // Final answer initially nill
        char c; // to store each char fromthe input string

        // Looping from last
        for (int i = s.length()-1; i >=0 ; i--) {
            // Storing the last char in c
            c = s.charAt(i);
            // Check if c is equal to #. If true
            if(c == '#'){
                // Get the 2 digit number available on left side of the # ans store it in updatedC
                String updatedC = s.charAt(i-2) + "" + s.charAt(i-1);
                // update my answer but store from last
                // updatedC+96 will generate a number. That number will be casted to char and then store at the end of the ans
                ans = (char)(Integer.parseInt(updatedC)+96) + ans;
                // After storing the value. Now our i should skip 2 digits left bec we are donw with those digits in above 2 lines.
                i = i -2;
            }
            // If c is not equal to #, then do this
            else {
                // update my ans from last.
                // cast the complete expression to char. add my c+96.
                ans = (char)(Integer.parseInt(String.valueOf(c))+96) + ans;
            }
        }

        // return the final String ans
        return ans;
    }
}
