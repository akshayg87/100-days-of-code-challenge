//Recursively remove all adjacent duplicates
public class removeDuplicatesRecursively {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(SubPro(s));
    }

    static String SubPro(String str){
        String ans = "";
        if (str.length()==0){
            return "";
        }
        char chR=' ',ch=' ',chL=' ';
        for (int i=0;i<str.length();i++){
            if(i!=0)
                chL = str.charAt(i-1);
            else
                chL = ' ';
            ch = str.charAt(i);
            if(i!=str.length()-1)
                chR = str.charAt(i+1);
            else
                chR = ' ';

            if((ch!=chR)&&(ch!=chL)){
                ans = ans + ch;
            }
        }
        if((ans.compareTo(str)!=0)||(ans=="")){
            return SubPro(ans);
        }
        else{
            return ans;
        }
    }
}
