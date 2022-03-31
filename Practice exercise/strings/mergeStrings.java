//Merge two strings
public class mergeStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Bye";
        System.out.println(merge(s1,s2));
    }

    static String merge(String s1, String s2){
        String res = "";
        int n1 =s1.length();
        int n2 =s2.length();

        if (n1>n2){
            for (int i = 0; i < n2; i++) {
                res += s1.charAt(i);
                res += s2.charAt(i);
            }
            return res+s1.substring(n2);
        }
        for (int i = 0; i < n1; i++) {
            res += s1.charAt(i);
            res += s2.charAt(i);
        }
        return res+s2.substring(n1);

    }
}
