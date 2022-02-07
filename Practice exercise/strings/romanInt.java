public class romanInt {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(num(s));
    }

    static int num(String s){
        int val = 0, prev = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> val = 1;
                case 'V' -> val = 5;
                case 'X' -> val = 10;
                case 'L' -> val = 50;
                case 'C' -> val = 100;
                case 'D' -> val = 500;
                case 'M' -> val = 1000;
            }

            if (val > prev) {
                sum = sum - prev + val - prev;
            }
            else {
                sum = sum + val;
            }
            prev = val;
        }
        return sum;
    }
}
