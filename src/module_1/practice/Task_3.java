package module_1.practice;

public class Task_3 {
    static double withdraw(double balance, double withdrawal, double commission){
//        double commission = 1.5;
        return balance - withdrawal - commission;
    }
    public static void main(String[] args) {
        double balance = 1025;
        double withdraw = 1024;
        double commission = balance * 0.05;
        double balanceAfter = withdraw(balance, withdraw, commission);
        if (balanceAfter >= 0){
            System.out.println("Yes, your current balance " + balanceAfter);
        }
        else{
            System.out.println("No money");
        }
    }
}
