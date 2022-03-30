//Counts Zeros Xor Pairs
public class CountXOR {
    public static void main(String[] args){
        int[] arr = {1,3,2,2};
        int n = arr.length;
        System.out.println(countZeros(arr,n));
    }

    static int countZeros(int[] arr, int n){
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if ((arr[i]^arr[j]) == 0 && i!=j){
                    count++;
                }
            }
        }

        return count;
    }
}
