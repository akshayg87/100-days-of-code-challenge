package bitwise;

import java.util.ArrayList;
import java.util.List;

public class binaryWatch {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(watch(n));
    }

    static List<String> watch(int turnedOn)
    {
        List<String> list = new ArrayList<>();

        for (int h=0; h<12; h++){
            for (int m=0; m<60; m++){
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn)
                {
                    if (m<10)
                        list.add(String.format("%d:0%d",h,m));
                    else
                        list.add(String.format("%d:%d",h,m));
                }
            }
        }
    return list;
    }

}
