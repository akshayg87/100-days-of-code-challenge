package recursion;

public class uppercase {
    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(Letter(s, 0));
    }

    static char Letter(String s, int i)
    {
        if (i > s.length())
            return 0;

        for (i = 0; i < s.length(); i++)
        {
           if(Character.isUpperCase(s.charAt(i)))
               return s.charAt(i);


        }
        return Letter(s, i+1);
    }
}
