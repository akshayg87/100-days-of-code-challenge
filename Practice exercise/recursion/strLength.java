package recursion;

public class strLength {
    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(Len(str));
    }

    static int Len(String str) {
        if (str.equals(""))
            return 0;
        else
            return Len(str.substring(1))+1;

    }
}

