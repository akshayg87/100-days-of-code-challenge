package intermediate;

class countoccur {
    public static void main(String[] args) {
        String input = "aabhrkA1235hajka";
        char search = '2';
        int count = 0;

        for (int i = 0; i < input.length(); i++)
        {
        if (input.charAt(i) == search)
            count++;
        }
        System.out.println("The character " +search+ " appears " +count+ " times in the given string: " +input);
    }

}