//Sum of two large numbers
public class bigIntSum {
    public static void main(String[] args) {
        String x = "2500";
        String y = "13";
        System.out.println(findSum(x,y));
    }

    static String findSum(String x, String y){
        java.math.BigInteger n1 = new java.math.BigInteger(x);
        java.math.BigInteger n2 = new java.math.BigInteger(y);
        java.math.BigInteger sum = n1.add(n2);
        return sum.toString();
    }
}
