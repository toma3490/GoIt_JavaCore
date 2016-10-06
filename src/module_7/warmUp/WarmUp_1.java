package module_7.warmUp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WarmUp_1 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(31);
        list.add(1);
        list.add(45);
        list.add(23);
        list.add(87);

        System.out.println(list);
        list.sort(new IncreaseOrder());
        System.out.println(list);
        list.sort(new DecreaseOrder());
        System.out.println(list);
    }



}
