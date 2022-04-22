//Nearest multiple of 10
public class closestTen {
    public static void main(String[] args){
        int n = 29;
        System.out.println(closest(n));
    }

    static int closest(int n){
        int a = n%10;
        if (a<=5)
            return n-a;
        return n-a+10;
    }
}
