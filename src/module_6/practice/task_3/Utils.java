package module_6.practice.task_3;

public abstract class Utils {

    public static String removeChars(char letter, String string){
        String result = new String();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != letter){
                result += string.charAt(i);
            }
        }
        return result;
    }

    public static String removeChars2(char letter, String string){
        return string.replaceAll(letter + "", "");
    }
}
