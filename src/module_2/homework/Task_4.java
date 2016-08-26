package module_2.homework;

public class Task_4 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static void nameChecker(String ownerName, double fund){
        boolean flag = false;
        for (String name : ownerNames) {
            if(ownerName.equals(name))flag = true;
        }
        if (flag) fundChecker(ownerName, fund);
        else System.out.println("Name is incorrect!!");
    }

    static void fundChecker(String ownerName, double fund){
        boolean flag = false;
        if(fund > 0) flag = true;
        if (flag) System.out.println(ownerName + " " + fundBalance(ownerName, fund));
        else System.out.println("Incorrect fund");
    }

    static double fundBalance(String ownerName, double fund) {
        int index = 0;
        for (int i = 0; i <= ownerNames.length-1; i++) {
            if (ownerName.equals(ownerNames[i])){
                index = i;
            }
        }
        int balance = balances[index];
        return balance + fund;
    }

    public static void main(String[] args) {
        String ownerName = "Jane";
        double fund = 30.56;

        nameChecker(ownerName, fund);
    }
}
