//Roman Number to Integer
public class romanToInt {
    public static void main(String[] args) {
        String s = "IV";
        System.out.println(romanToDecimal(s));
    }
    static int romanToDecimal(String str) {
        // code here
        int result = convertRomanToInteger(str.charAt(0));

        for(int i = 1; i < str.length(); i++) {
            int pre = convertRomanToInteger(str.charAt(i - 1));
            int curr = convertRomanToInteger(str.charAt(i));

            if(pre >= curr)
                result += curr;
            else
                result = result - pre + curr - pre;
        }
        return result;
    }

    static int convertRomanToInteger(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}

