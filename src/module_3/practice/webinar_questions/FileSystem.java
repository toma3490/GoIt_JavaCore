package module_3.practice.webinar_questions;

public class FileSystem {
    private byte systemCode;
    private long capacityInBytes;
    private String name;
    private int foldersCount;
    private int filesCount;

    public FileSystem(byte systemCode, long capacityInBytes, String name) {
        this.systemCode = systemCode;
        this.capacityInBytes = capacityInBytes;
        this.name = name;
        this.filesCount = 0;
        this.foldersCount = 0;
    }

    public void setFoldersCount() {
        this.foldersCount++;
    }

    public void setFilesCount() {
        this.filesCount++;
    }
}
