import java.math.BigInteger;

//Multiply two strings
public class stringMultiply {
    public static void main(String[] args){
        String s1 = "10";
        String s2 = "-20";
        System.out.println(product(s1,s2));
    }

    static String product(String s1, String s2){
        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = new BigInteger(s2);

        BigInteger p = n1.multiply(n2);

        return p.toString();
    }
}
