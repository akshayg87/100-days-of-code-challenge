//Max sum path in two arrays
public class maxSumPath {
    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b = {3,4,5};
        int l1 = a.length;
        int l2 = b.length;
        System.out.println(maxSum(a,b,l1,l2));
    }

    static int maxSum(int[] A, int[] B, int l1, int l2){
        int sum1=0, sum2=0, maxsum=0;
        int i=0, j=0;

        while(i<l1 && j<l2){
            if (A[i] < B[j]){
                sum1 += A[i];
                i++;
            }

            else if(B[j] < A[i]){
                sum2 += B[j];
                j++;
            }

            else{
                maxsum = Math.max(sum1,sum2) + A[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }

        while (i < l1){
            sum1 += A[i];
            i++;
        }

        while (j < l2){
            sum2 += B[j];
            j++;
        }

        return maxsum + Math.max(sum1, sum2);
    }
}
