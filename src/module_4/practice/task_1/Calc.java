package module_4.practice.task_1;

public class Calc implements MoneyConverter {
    private double k = 26.5;

    public double convertFromUSD(int i){
        return i * k;
    }
}
