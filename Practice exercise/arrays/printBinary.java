//Print N-bit binary numbers having more 1s than 0s

import java.util.ArrayList;

public class printBinary {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(NBitBinary(n));
    }
    static ArrayList<String> NBitBinary(int N) {
        int count_one=0,count_zero=0;
        ArrayList<String>res=new ArrayList<>();
        generateNBitBinary("",count_one,count_zero,N,res);
        return res;
    }
    static void generateNBitBinary(String op,int c1,int c0,int N,ArrayList<String>ans){
        if(c1+c0==N)
        {
            ans.add(op);
            return;
        }
        if(c1<N){
            generateNBitBinary(op+"1",c1+1,c0,N,ans);
        }
        if(c1>c0)
        {
            generateNBitBinary(op+"0",c1,c0+1,N,ans);
        }
    }
}
