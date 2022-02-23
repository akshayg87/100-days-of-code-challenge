import java.util.ArrayList;

public class arrayListSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5,5};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(find(arr, 5, 0, list));
    }
    static ArrayList<Integer> find(int[] arr, int target, int index, ArrayList<Integer> list)
    {
        if (index == arr.length)
            return list;

        if (arr[index] == target)
            list.add(index);

        return find(arr, target, index+1, list);

    }
}
