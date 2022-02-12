package bitwise;

public class binaryGap {
    public static void main(String[] args) {
        int n = 22;
        System.out.println(gap(n));
    }

    static int gap(int n)
    {
        int max=0,count=0,j=0;
        while(n!=0){
            if(count>=1) j++;
            if((n & 1)==1){
                if(count <2){
                    count++;
                }
            }
            if(count==2){
                max=Math.max(max,j);
                count=1;
                j=0;
            }
            n>>=1;
        }
        return max;
    }
}
