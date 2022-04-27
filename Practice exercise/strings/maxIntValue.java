//Maximum Integer Value

public class maxIntValue {
    public static void main(String[] args){
        String s = "01230";
        System.out.println(maxValue(s));
    }

    static long maxValue(String s){
        long max=0;
        long mul;
        long sum;
        for (int i=0; i<s.length(); i++){
            long n = Long.parseLong(s.substring(i,i+1));
            mul = max*n;
            sum = max+n;
            max=Math.max(mul,sum);
        }
        return max;
    }
}
