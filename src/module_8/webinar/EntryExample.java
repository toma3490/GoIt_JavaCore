package module_8.webinar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntryExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "test1");
        map.put("2", "test2");
        map.put("3", "test3");
        map.put("4", "test4");

        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        Map.Entry<String, String> ob = iterator.next();


        System.out.println(map.entrySet());
    }
}
