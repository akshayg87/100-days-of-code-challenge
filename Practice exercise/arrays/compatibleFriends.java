//Compatible Friends
public class compatibleFriends {
    public static void main(String[] args){
        int[] a1 = {1, 3, 2, 4, 5};
        int[] a2 = {3, 2, 4, 5, 1};
        System.out.println(compatible(a1,a2,a1.length));
    }

    static int compatible(int[] a1, int[] a2, int n){
        int count = 0;
        for(int i=0; i<n; i++){
            int j = i+1;
            while (a1[i]!=a2[i]){
                count++;
                int temp = a1[i];
                a1[i] = a1[j];
                a1[j] = temp;
                j++;
            }
        }

        return count;
    }
}
