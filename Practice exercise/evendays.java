package intermediate;

public class evendays {
    public static void main(String[] args) {
        int n1=1, n2 =31;
        System.out.println("The number of days in August are 31");
        System.out.println("The days Kunal can go out on are: ");

        for (int i = 1; i < n2 ; i++)
        {
            if (i%2==0)
                System.out.println(i);
        }
    }
}
