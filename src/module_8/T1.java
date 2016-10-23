package module_8;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class T1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key", "value");
        map.put("key1", "value");


        System.out.println(map.keySet().size());
    }
}
