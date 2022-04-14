//Repetitive Addition Of Digits
public class repeatAdd {
    public static void main(String[] args){
        System.out.println(singleDigit(98));
    }

    static int singleDigit(long num){
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        num = num % 9;
        return (int)num;
    }
}
