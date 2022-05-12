//Capacity To Ship Packages Within D Days

public class shipCapacity {
    public static void main(String[] args) {
        int[] arr = {9, 8, 10};
        int D = 2;
        System.out.println(leastWeightCapacity(arr,arr.length,D));
    }

    static int leastWeightCapacity(int[] arr, int N, int D){
        int sum=0;
        for (int i = 0; i < N; i++) {
            sum = sum + arr[i];
        }
        int s=0, e=sum, mid=s-(s+e)/2;

        while (s<=e){
            if (isSolutionPossible(arr,mid,D)){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid = s+(e-s)/2;
        }
        return s;
    }

    static boolean isSolutionPossible(int[] arr, int mid, int D){
        int days=1;
        int weightSum=0;
        for (int i = 0; i < arr.length; i++) {
            if (weightSum+arr[i] <= mid)
                weightSum += arr[i];
            else{
                days++;
                weightSum = arr[i];
                if (days>D || arr[i]>mid)
                    return false;
            }
        }
        return true;
    }
}
