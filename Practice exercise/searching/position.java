import java.util.Arrays;

public class position {
public static void main(String[] args){
int[] nums = {5,7,7,8,8,10};
int target = 8;
    System.out.println(Arrays.toString(find(nums, target)));
}

static int[] find(int[] nums, int target)
{
    int[] arr = new int[2];
    int start = -1;
    int end = -1;

    for(int i=0; i<nums.length; i++){
        if (nums[i] == target) {
            start = i;
            break;
        }
    }

    for (int j = nums.length-1; j >= 0 ; j--) {
        if (nums[j] == target) {
            end = j;
            break;
        }
    }

    arr[0] = start;
    arr[1] = end;
    return arr;
}
}
