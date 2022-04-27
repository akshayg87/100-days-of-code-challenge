//Extract number from the String

public class extractNumber {
    public static void main(String[] args) {
        String s = "This is alpha 5057 and 97";
        System.out.println(getNum(s));
    }

    static long getNum(String S)
    {
        long an =-1;
        long result;
        for(int x=0;x<S.length() ;++x) {
            if(Character.isDigit(S.charAt(x)) ) {
                boolean temp = true ;
                result= 0 ;
                while(x<S.length() && Character.isDigit(S.charAt(x)) )
                {
                    int value = Integer.parseInt(S.valueOf(S.charAt(x)))  ;
                    if(value==9){
                        temp = false ;
                }
                result = result*10+value ;

                ++x ;
            }
            if(temp){
                an  = Math.max(result , an) ;
            }
        }
    }
   return  an;
}
}

