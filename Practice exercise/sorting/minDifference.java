package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minDifference {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }

    static List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(arr);
        int min = absMin(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                answer.add(innerList(i, i + 1, arr));
            }
        }
        return answer;
    }

    // Function to provide absolute minimum from the array given
    static int absMin(int[] arr) {

        int min = 99999999;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < min) {
                min = arr[i + 1] - arr[i];
            }
        }
        return min;
    }

    // as we have to return List<List<Integer>>
    //so function to explicity add List<Integer>
    static private List<Integer> innerList(int i, int j, int[] arr) {
        List<Integer> innerAnswer = new ArrayList<>();
        innerAnswer.add(arr[i]);
        innerAnswer.add(arr[j]);
        return innerAnswer;
    }
}
