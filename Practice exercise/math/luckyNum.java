//Lucky Numbers
public class luckyNum {
    public static void main(String[] args) {
        System.out.println(isLucky(19));
    }

    static boolean isLucky(int n) {
        int i=2;
        while(n>=i){
            if(n%i==0)return false;
            n -= (n/i);
            i++;
        }
        return true;
    }

}
