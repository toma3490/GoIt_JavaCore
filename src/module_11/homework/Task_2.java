package module_11.homework;

import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class Task_2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        map.put("scream", "said");
        map.put("said", "scream");
        fileContentReplacer(map, "src/module_11/homework/task_2.txt");

    }

    private static File fileContentReplacer(Map<String, String> map, String filePath) {
        String newString = Task_1.replacer(map, filePath);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePath)))) {
            bufferedWriter.write(newString);
        } catch (IOException e) {
            System.err.println("Error while writing file!");
        }
        System.out.println("Check your file - it's rewritten!");
        return new File(filePath);
    }
}
