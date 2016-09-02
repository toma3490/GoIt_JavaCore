package module_3.practice.offlineMiting.task_2;

public class Converter {
    private final double rate;

    public Converter(double rate) {
        this.rate = rate;
    }

    public double convertGRNtoUSD (double sum){
        return sum / rate;
    }
}
