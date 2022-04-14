//How Many X's?
public class numberOfX {
    public static void main(String[] args){
        System.out.println(findX(18,81,9));
    }

    static int findX(int L, int R, int X){
        int count = 0;
        L++;
        while(L<R){
            int v = L;
            while(v!=0){
                if (v%10 == X){
                    count++;
                }
                v/=10;
            }
            L++;
        }
        return count;
    }
}
