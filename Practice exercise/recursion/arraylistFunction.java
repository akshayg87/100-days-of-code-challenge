import java.util.ArrayList;

public class arraylistFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4};
        System.out.println(find(arr, 4, 0));

    }
    static ArrayList<Integer> find(int[] arr, int target, int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
            return list;

        if (arr[index] == target)
            list.add(index);

        ArrayList<Integer> ans = find(arr, target, index+1);
          // This contains all values from below function calls and adds it to list
        list.addAll(ans);
        return list;
    }
}
