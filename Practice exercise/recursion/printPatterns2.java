public class printPatterns2 {
    public static void main(String[] args) {
        trinagle2(4,0);
    }
    static void trinagle2(int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            trinagle2(r,c+1);
            System.out.print("*");
        }
        else {
            trinagle2(r-1,0);
            System.out.println();
        }
    }
}
