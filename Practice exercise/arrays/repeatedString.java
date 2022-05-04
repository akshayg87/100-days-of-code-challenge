//Repeated String Match

public class repeatedString {
    public static void main(String[] args){
        String a = "abcd";
        String b = "abcdab";
        System.out.println(repeatStringMatch(a,b));

    }

    static int repeatStringMatch(String a, String b){
        String t = "";
        int count = 0;
        int k = a.length() + b.length();

        while (k>=t.length()){
            t=t.concat(a);
            count++;
            if (t.contains(b))
                break;
        }
        if (t.contains(b))
            return count;

        return -1;
    }
}
