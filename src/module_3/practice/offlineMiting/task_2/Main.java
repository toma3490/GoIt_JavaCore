package module_3.practice.offlineMiting.task_2;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter(26.3);

        System.out.println("Result of converting = " + String.format("%.4f%n", converter.convertGRNtoUSD(100)));
    }
}
