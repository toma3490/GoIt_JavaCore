package module_10.homework;

public class Task_3 {
    public static void main(String[] args) {
        Integer integer = null;
        try {
            integer.intValue();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
