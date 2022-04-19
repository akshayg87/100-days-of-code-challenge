//Jump Game
public class jumpGame {
    public static void main(String[] args){
        int[] a = {1, 2, 0, 3, 0, 0};
        System.out.println(jump(a,a.length));
    }

    static Boolean jump(int[] a, int n){
        int rec=0;
        for(int i=0;i<n;i++)
        {
            if(rec<i)
            {
                return false;
            }
            rec=Math.max(rec,i+a[i]);
        }
        return true;
    }
}
