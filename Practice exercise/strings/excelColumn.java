package strings;

public class excelColumn {
    public static void main(String[] args) {
        int columnNumber = 28;
        System.out.println(sheet(columnNumber));
    }

    static String sheet(int n)
    {
        char[] alpha = "ZABCDEFGHIJKLMNOPQRSTUVWXY".toCharArray();
        String s = "";
        while(n != 0){
            s = alpha[n % 26] + s;
            if(n % 26 == 0)
                n -= 26;
            n /= 26;
        }
        return s;
    }
}
