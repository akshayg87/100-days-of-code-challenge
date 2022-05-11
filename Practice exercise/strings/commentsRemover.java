//Comment Removal

public class commentsRemover {
    public static void main(String[] args) {
        String s = "#include int main(int *argc,char **argv)\n" +
                "{ // First line of code\\n \n" +
                "printf(\"Hello World!!! \"); return 0; }";
        System.out.println(removeComments(s));
    }

    static String removeComments(String s){
        s=s.replaceAll("/"+"\\*"+"(.*)"+"\\*"+"/", "");
        s=s.replaceAll("\\/"+"\\/"+"(.*)"+"n", "");
        return s;
    }
}
