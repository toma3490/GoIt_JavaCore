package module_2.homework;

public class Task_2 {

    static void balanceChecker(double balance, double withdrawal, double commission){
        if (withdrawBalance(balance, withdrawal, commission) > 0){
            System.out.println("OK " +  commission + " " + withdrawBalance(balance, withdrawal, commission));
        }else {
            System.out.println("NO");
        }
    }

    static double withdrawBalance(double balance, double withdrawal, double commission) {
        return balance - withdrawal - withdrawal * commission;
    }

    public static void main(String[] args) {

        double balance = 500;
        double withdrawal = 475;
        double commission = 0.05;

        balanceChecker(balance, withdrawal, commission);
    }
}


