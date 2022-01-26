package strings;

public class equalHalf {
    public static void main(String[] args) {
        String s = "bcok";
        System.out.println(equal(s));
    }

    static boolean equal(String s)
    {
        StringBuffer str=new StringBuffer(s);
        String a=str.toString().toLowerCase();

        int acount=0,bcount=0;
        int  mid=s.length()/2;
        for(int i=0;i<mid;i++){
            if(a.charAt(i)=='a' ||a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                acount++;
            }
        }

        for(int i=mid;i<s.length();i++){
            if(a.charAt(i)=='a' ||a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                bcount++;
            }
        }
        if(acount==bcount){
            return true;
        }
        return false;
    }

}
