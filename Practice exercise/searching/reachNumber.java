public class reachNumber {
    public static void main(String[] args) {
        int target = 2;
        System.out.println(stepCount(target));
    }

    static int stepCount(int target)
    {
        target = Math.abs(target);
        int steps = 0;
        int i = 1;
        int sum = 0;

        while (sum < target){
            sum += i;
            i++;
            steps++;
        }

        while ((sum - target)%2 != 0){
            sum += i;
            i++;
            steps++;
        }
        return steps;
    }
}
