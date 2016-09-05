package module_4.practice.task_1;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        demonstrate(calc, 100);
    }

    private static void demonstrate(MoneyConverter moneyConverter, int moneyCount){
        System.out.println(moneyConverter.convertFromUSD(moneyCount));
    }
}
