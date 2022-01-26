package strings;

public class defangingIP {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defang(address));
    }

    static String defang(String add)
    {
        return add.replace("." , "[.]");
    }
}
