//Split the binary string into substrings with equal number of 0s and 1s

public class splitBinaryString {
    public static void main(String[] args) {
        String s = "1011100010";
        System.out.println(maxSubStr(s));
    }

    static int maxSubStr(String str){
        int count0=0,count1=0,count=0;
        int ct0=0,ct1=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                count0++;
                ct0++;
            }
            if(str.charAt(i)=='1')
            {
                count1++;
                ct1++;
            }
            if(count0==count1)
            {
                count++;
                count0=0;
                count1=0;
            }
        }
        if(ct0!=ct1)
        {
            return -1;
        }
        return count;
    }
}
