//Largest Number formed from an Array

import java.util.Arrays;

public class largestNumber {
    public static void main(String[] args) {
        String[] arr = {"3", "30", "34", "5", "9"};
        System.out.println(printLargest(arr));
    }
    static String printLargest(String[] arr) {
        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b));
        String s="";
        for(String x:arr)
            s+=x;
        return s;
    }
}
