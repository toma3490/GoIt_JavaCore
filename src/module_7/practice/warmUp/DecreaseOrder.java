package module_7.practice.warmUp;

import java.util.Comparator;

public class DecreaseOrder implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i2 - i1;
    }
}
