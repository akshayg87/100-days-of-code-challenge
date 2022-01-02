package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class shuffle {
    public static void main(String[] args) {
        String[] letters = { "P","Q","R","S"};
        System.out.println("Initial array = " + Arrays.toString(letters));
        List <String> list = Arrays.asList(letters);
        int len = list.size();
        System.out.println("Shuffled array ....");
        for (int i = 0; i < letters.length; i++) {
            int index = new Random().nextInt(len);
            String shuffle = list.get(index);
            System.out.println(shuffle);

        }
    }
}
