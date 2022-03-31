//Find roots of quadratic equation
import java.util.Arrays;

public class quadraticRoots {
    public static void main(String[] args) {
        double A = 1, B = 7, C = 10;
        System.out.println(Arrays.toString(roots(A,B,C)));
    }

    static double[] roots(double A, double B, double C)
    {
        double root_det = B*B - 4*A*C;

        if(root_det<0) return new double[]{-1.0};

        root_det = Math.sqrt(root_det);

        double r2 = (-B + root_det)/(2*A);
        double r1 = (-B - root_det)/(2*A);

        if(r2>r1)
        {
            double temp = r2;
            r2 = r1;
            r1 = temp;
        }

        return new double[]{r2, r1};
    }
}
