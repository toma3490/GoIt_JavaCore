package module_11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class T1 {
    public static void main(String[] args) throws IOException {
        InputStream f = new FileInputStream("src/module_11/t_1.txt");
        System.out.println(f.read());

    }
}
