//Number of minimum picks to get 'k' pairs of socks from a drawer

public class sockPairs {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 3};
        int k = 6;
        System.out.println(find_min(a,a.length,k));
    }
    static int find_min(int[] a, int n, int k) {
        int p=0;
        int sum=0;

        for(int i=0;i<n;i++){
            p+=a[i]/2;
            if(a[i]%2==0){
                sum+=(a[i]-2)/2;
            }
            else{
                sum+=(a[i]-1)/2;
            }
        }
        if(p<k){
            return -1;
        }
        else if(sum>=k){
            return (2*(k-1))+n+1;
        }
        else{
            return (2*sum)+n+(k-sum);
        }
    }
}
