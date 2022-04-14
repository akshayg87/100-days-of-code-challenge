//Check if a number can be expressed as x^y
public class powerExpr {
    public static void main(String[] args){
        System.out.println(powerOfTwoDigits(8));
    }

    static boolean powerOfTwoDigits(int n){
        if (n==1){
            return true;
        }

        for(int i=1; i<n/2; i++){
            for(int j=2; j<n; j++){
                if (Math.pow(i,j)==n)
                    return true;
            }
        }
    return false;
    }
}
