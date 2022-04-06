//Does robot moves circular
public class robotMoves {
    public static void main(String[] args) {
       String path = "GLGLGLG";
        System.out.println(isCircular(path));
    }

    static String isCircular(String s) {
        int x = 0, y = 0;

        int n = s.length();

        int dir = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == 'G') {
                if (dir == 0) {
                    y++;
                } else if (dir == 1) {
                    x++;
                } else if (dir == 2) {
                    y--;
                } else {
                    x--;
                }
            } else if (ch == 'L') {
                if (dir == 0) dir = 3;
                else dir--;
            } else {
                dir = (dir + 1) % 4;
            }
        }

        return x == 0 && y == 0 ? "Circular" : "Not Circular";
    }
}
