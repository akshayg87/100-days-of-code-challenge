//Longest Common Prefix in an Array
public class commonPrefix {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks","geeks","genius"};
        int n = arr.length;
        System.out.println(longestCommonPrefix(arr,n));
    }

    static String longestCommonPrefix(String[] arr, int n){
        // code here
        int longest = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++)
        {
            if(arr[i].length() > arr[longest].length()){
                longest = i;
            }
        }

        for(int i=0; i<arr[longest].length(); i++)
        {
            int equalCharCount = 1;
            for(int j=0; j<n && i<arr[j].length(); j++)
            {
                if(j == longest)
                    continue;
                if(arr[longest].charAt(i) != arr[j].charAt(i))
                    break;
                equalCharCount++;
            }

            if(equalCharCount == n)
                sb.append(arr[longest].charAt(i));
        }

        if(sb.length() == 0)
            sb.append("-1");
        return sb.toString();
    }
}
