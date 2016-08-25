package module_2.homework;

public class Task_2 {

    static double withdrawBalance(double balance, double withdrawal) {
        return balance - withdrawal - withdrawal * 0.05;
    }

    public static void main(String[] args) {

        double balance = 500;
        double withdrawal = 475;

        if (withdrawBalance(balance, withdrawal) > 0) {
            System.out.println("OK 0.05 " + withdrawBalance(balance, withdrawal));
        } else {
            System.out.println("NO");
        }
    }
}


