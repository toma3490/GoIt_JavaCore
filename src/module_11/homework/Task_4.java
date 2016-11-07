package module_11.homework;

import java.util.HashMap;
import java.util.Map;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println(checkWord("src/module_11/homework/task_4.txt", "Shoes"));
    }

    private static int checkWord(String filePath, String word) {
        Map<String, String> map = new HashMap<>();
        map.put("", "");
        String string = Task_1.replacer(map, filePath);
        int result = 0;
        for (String str : string.split(" ")) {
            if (str.contains(word)) {
                result++;
            }
        }
        return result;
    }
}
