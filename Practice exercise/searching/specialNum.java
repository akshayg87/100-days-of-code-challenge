package search;

public class specialNum {
    public static void main(String[] args) {
        int[] arr = {0,0};
        System.out.println(specialArray(arr));
    }
    static int specialArray(int[] nums) {
    int start=0;
    int end=nums.length;
    while(start<=end)
    {
        int mid=start+(end-start)/2;
        int v=isValid(nums,mid);
        if(v==mid)
        {
            return v;
        }
        else if(v<mid)
        {
            end=mid-1;
        }
        else if(v>mid)
        {
            start=mid+1;
        }
    }
    return -1;
}
    static int isValid(int[]arr,int t)
    {
        int count=0;
        for(int i:arr)
        {
            if(i>=t)
            {
                count=count+1;
            }
        }
        return count;
    }
}

