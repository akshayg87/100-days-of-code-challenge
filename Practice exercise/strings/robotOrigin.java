package strings;

public class robotOrigin {
    public static void main(String[] args) {
       String moves = "UL";
        System.out.println(Origin(moves));
    }

    static boolean Origin(String moves)
    {
        int up = 0, left = 0;
        char[] charArray = moves.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char move = charArray[i];
            if (move == 'L')
                left++;
            else if (move == 'R')
                left--;
            else if (move == 'U')
                up++;
            else
                up--;
        }
        return left == 0 && up == 0;
    }
}
