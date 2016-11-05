package module_11.practice;

import java.io.*;
import java.net.URL;

public class Task_3_1 {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(url.openStream()));

        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line + System.lineSeparator());
        }
        reader.close();
        String result = stringBuilder.toString();

        Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("./src/module_11/practice/privat.json")));
        try {
            writer.write(result);
        } catch (IOException e) {
            /* TODO: handle exception */
        }
        writer.flush();
        writer.close();


        System.out.println("OK!\n" + result);

    }

}
