//Finding Position
public class findingPosition {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(findeven(n));
    }

    static int findeven(int n){
        if(n==1)
            return 1;

        return findeven(n/2)*2;
    }
}
