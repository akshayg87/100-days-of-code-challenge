//Check if string is rotated by two places
public class rotatedString {
    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "geeksgeeksfor";
        System.out.println(isRotated(str1,str2));

    }

    static boolean isRotated(String str1, String str2)
    {
        // Your code here
        boolean flag = false;
        if(flag==false){
            String s1 = str1.substring(2) + str1.substring(0, 2);
            if(s1.compareTo(str2)==0){
                return true;
            }
            flag = true;
        }

        if(flag==true){
            String s2 = str1.substring(str1.length()-2) + str1.substring(0, str1.length()-2);
            if(s2.compareTo(str2)==0){
                return true;
            }
        }

        return false;
    }
}
