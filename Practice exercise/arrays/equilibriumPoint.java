//Equilibrium Point
public class equilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        System.out.println(equilibrium(arr,arr.length));
    }

    static int equilibrium(int[] a, int n) {
        int rcu=0;
        int lcu=0;
        for(int i=0;i<n;i++)
            rcu+=a[i];
        for(int i=0;i<n;i++){
            rcu-=a[i];
            if(lcu==rcu)
                return i+1;
            lcu+=a[i];
        }return -1;
    }
}
