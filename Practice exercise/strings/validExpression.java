//Valid Expression
public class validExpression {
    public static void main(String[] args){
        String s = "{}{[()]}";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s){
        int n = -1;
        while(n!=s.length()){
            n=s.length();
            s = s.replace("()","");
            s = s.replace("[]","");
            s = s.replace("{}","");
        }
        return s.length() <= 0;
    }
}
