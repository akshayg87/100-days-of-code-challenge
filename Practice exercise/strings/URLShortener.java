//Design a tiny URL or URL shortener

public class URLShortener {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(urlShort(n));
    }

    static String urlShort(int n){
        String out = "";
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        while(n>0){
            out = s.charAt( (int)(n%62) ) + out;
            n=n/62;
        }
        return out;
    }
}
