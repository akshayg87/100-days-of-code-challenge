import java.util.Arrays;

public class rightInterval {
    public static void main(String[] args) {
        int[][] arr = {{3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(Interval(arr)));
    }
    static int[] Interval(int[][] intervals)
    {
        int[] first_elements = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            first_elements[i] = intervals[i][0];
        }

        int[] res = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            res[i] = right_interval(first_elements, intervals[i][1]);
        }

        return res;
    }

    static int right_interval(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        if (arr[start] < arr[end])
        {
            while (start<=end)
            {
                int mid = start + (end-start)/2;
                if (arr[mid] == target) {
                    return mid;
                }

                else if (target > arr[mid]){
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }

            if (start > arr.length){
                return -1;
            }
            else {
                return start;
            }

        }

        else
        {
            while (start<=end){
                int mid = start + (end - start)/2;
                if (arr[mid] == target){
                    return mid;
                }

                else if (target > arr[mid]){
                    end = mid - 1;
                }

                else {
                    start = mid + 1;
                }
            }

            if (end < 0){
                return -1;
            }
            else{
                return end;
            }
        }
    }
}
