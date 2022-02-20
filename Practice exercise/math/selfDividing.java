package math;
import java.util.List;
import java.util.ArrayList;

public class selfDividing {
    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(divide(left, right));
    }

    static List<Integer> divide(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i))
                res.add(i);
        }
        return res;
    }

    static boolean isSelfDividing(int n) {
        int a = n;
        while (a != 0){
        int b = a % 10;
        if (b == 0) return false;
        if (n % b != 0) return false;
        a /= 10;
        }
    return true;
    }
}
