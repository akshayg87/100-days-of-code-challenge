public class customDice {
    public static void main(String[] args) {
        dice("", 8, 9);
    }

    static void dice(String p, int target, int face){
        if (target==0)
        {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            dice(p+i, target-i, face);

        }
    }
}
