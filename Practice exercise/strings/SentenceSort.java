package strings;

public class SentenceSort {
    public static void main(String[] args) {
       String s = "is2 sentence4 This1 a3";
        System.out.println(sort(s));
    }

    static String sort(String s)
    {
        String[] strs = new String[9];
        int i=0, beg=-1;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9')
                strs[ch-'0'-1] = s.substring(beg,i);
            else if(ch==' ')
                beg=-1;
            else if(beg==-1)
                beg=i;
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for(i=0;i<9 && strs[i]!=null;i++)
            sb.append(' ').append(strs[i]);
        return sb.substring(1);
    }
}
