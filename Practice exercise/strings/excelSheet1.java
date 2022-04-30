//Excel Sheet | Part - 1
public class excelSheet1 {
    public static void main(String[] args){
        int n = 51;
        System.out.println(excelColumn(n));
    }

    static String excelColumn(int N){
        String[] arr = new String[100];
        String ans ="";

        int i = 1;
        for (char a = 'A'; i <= 'Z'; a++){
            arr[i] = a + "";
            i++;
        }

        if (N<=26) {
            ans += arr[N];
        }
        else {
            while (N > 26) {
                if (N % 26 == 0) {
                    ans = arr[26] + ans;
                    N = (N / 26) - 1;
                } else {
                    ans = arr[N % 26] + ans;
                    N = N / 26;
                }
            }
        }
        ans = arr[N] + ans;

        return ans;
    }
}
