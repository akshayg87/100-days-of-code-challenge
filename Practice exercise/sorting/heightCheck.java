package sorting;

public class heightCheck {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,1,3};
        System.out.println(heightChecker(arr));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static int heightChecker(int[] heights) {
        int[] fh = heights.clone();
        int count=0;
        bubbleSort(heights);

        for(int i=0;i<heights.length;i++)
            if(heights[i]!=fh[i])
                count++;
        return count;
    }
}
