//Rearrange a string

import java.util.Arrays;

public class rearrangeString {
    public static void main(String[] args){
        String s = "AC2BEW3";
        System.out.println(arrangeString(s));
    }

    static String arrangeString(String s)
    {
        long sum=0;
        String n=s.replaceAll("[^0-9]","");
        for(int i=0;i<n.length();i++){
            sum=sum+Long.parseLong(n.substring(i,i+1));
        }
        s=s.replaceAll("[^A-Z]","");
        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);
        String p = String.valueOf(ch1);
        if(sum!=0){
            return p+""+sum;
        }
        return p;
    }
}
