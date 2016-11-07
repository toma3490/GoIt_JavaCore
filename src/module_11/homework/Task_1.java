package module_11.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("morning", "night");

        System.out.println(replacer(map, "src/module_11/homework/task_1.txt"));

    }

    public static String replacer(Map<String, String> map, String filePath) {
        String result = "";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                String key = new ArrayList<>(map.keySet()).get(0);
                if (currentLine.contains(key)) {
                    currentLine = currentLine.replaceAll(key, map.get(key));
                }
                result = result + currentLine + '\n';
            }
        } catch (IOException e) {
            System.err.println("Error while reading file!");
        }
        return result;
    }

}
