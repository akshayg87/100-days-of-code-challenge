package exercise;

public class subtractproductsum {
    public static void main(String[] args) {
        System.out.println("The given number is: ");
        int n = 564;
        System.out.println(n);

        int product = 1, sum = 0;
        while(n>0)
        {
            product *= (n%10);
            sum += (n%10);
            n/=10;
        }
        int no = product - sum;
        System.out.println("Product is = " + product);
        System.out.println("Sum is = " + sum);
        System.out.println("The required difference is = " + no);

    }
}
