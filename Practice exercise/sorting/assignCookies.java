package sorting;

public class assignCookies {
    public static void main(String[] args) {
        int[] g= {2,1};
        int[] s = {3,2,1};

        bubbleSort(g);
        bubbleSort(s);

        System.out.println(findContentChildren(g,s));
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

        private static int findContentChildren(int[] g, int[] s) {
        int content = 0;
        int first = 0, second = 0;

        while (first<g.length && second<s.length)
        {
            if (s[second]>=g[first])
            {
                content++;
                first++;
                second++;
            }
            else
                second++;
        }
        return content;
    }

}
