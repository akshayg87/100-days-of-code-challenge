//License Key Formatting
public class licenceReformat {
    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int k = 2;
        System.out.println(licenceFormat(s,k));
    }

    static String licenceFormat(String s, int k){
        int n = s.length(), count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            if (count == k && ch != '-'){
                count=0;
                sb.append('-');
            }
            if (ch!='-'){
                sb.append(ch);
                count++;
            }
        }
        return sb.reverse().toString().toUpperCase();
    }
}
