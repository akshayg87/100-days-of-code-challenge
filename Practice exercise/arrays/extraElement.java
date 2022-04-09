//Index Of an Extra Element
import java.util.ArrayList;
public class extraElement {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,9,10,12};
        int[] b = {2,4,6,8,10,12};
        System.out.println(index(a,b,a.length));
    }

    static int index(int[] a, int[] b, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
        }
        for (int j = 0; j < b.length; j++) {
            list.add(b[j]);
        }
        int xor = list.get(0);
        for (int k = 1; k < list.size(); k++) {
            xor = xor ^ list.get(k);
        }
        int ans = list.indexOf(xor);
        return ans;
    }
}
