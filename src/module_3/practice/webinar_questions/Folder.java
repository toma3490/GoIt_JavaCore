package module_3.practice.webinar_questions;

public class Folder {
    File[] files = new File[Integer.MAX_VALUE];
    private String path;
    int index = 0;

    public Folder(String path) {
        this.path = path;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

//    public void setSystem(FileSystem system) {
//        this.system = system;
//    }
}
