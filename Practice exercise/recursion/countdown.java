public class countdown {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countDown(n));
    }

    static int countDown(int number) {
        if (number == 0) {
            return 0;
        }
        System.out.println(number);
        return countDown(number - 1);

    }
}
