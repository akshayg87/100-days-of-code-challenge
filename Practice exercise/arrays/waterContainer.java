//Container With Most Water

public class waterContainer {
    public static void main(String[] args){
        int[] arr = {3,1,2,4,5};
        System.out.println(maxArea(arr,arr.length));
    }
    static int maxArea(int[] a, int n){
        int res=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int area = (j-i) * Math.min(a[i],a[j]);
                res = Math.max(res,area);
            }
        }
        return res;
    }
}
