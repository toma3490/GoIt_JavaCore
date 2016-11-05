package module_11.practice;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://google.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

//        BufferedReader reader1 = new BufferedReader(new InputStreamReader(url.openStream(), "Cp1251"));

        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null){
            stringBuilder.append(line + System.lineSeparator());
        }

        reader.close();

        String result = stringBuilder.toString()
                .replaceAll("google", "yandex")
                .replaceAll("Google", "Yandex");
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./src/module_11/practice/google.txt"), StandardCharsets.UTF_8))){
            writer.write(result);
        }

        System.out.println("OK!" + result);
    }
}
