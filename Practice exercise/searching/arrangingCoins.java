package search;

public class arrangingCoins {

    static int arrange(int n) {
        int start = 0, end = n;
        while (start <= end) {
            long mid = start + (end + start) / 2;
            if ((mid * (mid + 1) / 2) == n) {
                return (int) mid;
            } else if ((mid * (mid + 1) / 2) > n) {
                end = end - 1;
            } else
                start = start + 1;
            }
        return end;

    }
}
