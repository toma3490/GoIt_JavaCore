package module_3.practice.webinar_questions;

public class Main {
    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem((byte)64, Long.MAX_VALUE, "FileSystemSimple");
        Folder folder = new Folder("d:/My Dokuments/Dropbox");
        File file = new File(256, folder);
    }
}
