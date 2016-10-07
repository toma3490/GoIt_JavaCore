package module_7.practice.warmUp;

import java.util.Arrays;
import java.util.Comparator;

public class WarmUp_3 {
    public static void main(String[] args) {
        String[] stringsArray = new String[9];
        stringsArray[0] = "Abba";
        stringsArray[1] = "Barto";
        stringsArray[2] = "Tomat";
        stringsArray[3] = "John";
        stringsArray[4] = "Viola";
        stringsArray[5] = "Lion";
        stringsArray[6] = "Django";
        stringsArray[7] = "Nuts";
        stringsArray[8] = "Zed";

        System.out.println(Arrays.toString(stringsArray));

//        Arrays.sort(stringsArray);
        System.out.println(Arrays.deepToString(stringsArray));

        Comparator <String> comparator = new Comparator <String>(){
            @Override
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        };

        Arrays.sort(stringsArray, comparator);

        System.out.println(Arrays.deepToString(stringsArray));
    }
}
