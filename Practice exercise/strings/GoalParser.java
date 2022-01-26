package strings;

import java.lang.String;

public class GoalParser {
    public static void main(String[] args) {
        String command = "G()()()(al)";
        System.out.println(goal(command));
    }

    static String goal(String command)
    {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
