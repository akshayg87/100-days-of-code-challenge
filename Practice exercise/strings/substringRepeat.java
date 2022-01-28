package strings;

public class substringRepeat {
    public static void main(String[] args) {
       String sequence = "ababc";
       String word = "ab";

        System.out.println(repeat(sequence,word));
    }

    static int repeat(String s, String word)
    {
        int i=0;
        int count=0;
        String res=word;
        while(s.contains(res))
        {
            count++;
            res=res.concat(word);

        }
        return count;
    }
}
