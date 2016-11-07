package module_11.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class Task_3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Socks", "Tights");

        fileContentMerger(map, "src/module_11/homework/task_3.txt");
    }

    private static File fileContentMerger(Map<String, String> map, String filePath) {
        String newString = Task_1.replacer(map, filePath);
        try(FileWriter fw = new FileWriter("src/module_11/homework/task_3.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
            out.println(newString);
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println("Check your file - it's rewritten!");
        return new File(filePath);
    }
}
