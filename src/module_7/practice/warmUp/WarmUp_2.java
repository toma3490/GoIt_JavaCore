package module_7.practice.warmUp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WarmUp_2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Abba");
        strings.add("Barto");
        strings.add("Tomat");
        strings.add("John");
        strings.add("Viola");
        strings.add("Lion");
        strings.add("Django");
        strings.add("Key");
        strings.add("Nuts");
        strings.add("Zed");

        System.out.println(strings);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        strings.sort(String::compareTo);
        System.out.println(strings);



    }
}
