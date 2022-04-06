//Count even substrings
public class evenSubstrings {
    public static void main(String[] args){
        String s = "154";
        System.out.println(evenString(s));
    }

    static int evenString(String s){
        int len = s.length();
        int count = 0;

        for (int i = 0; i < len; i++) {
            long temp = (long) s.charAt(i) - '0';

            if (temp % 2 == 0){
                count += (i+1);
            }
        }

        return count;
    }
}
