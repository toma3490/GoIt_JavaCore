package module_2.homework;

public class Task_3 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static void nameChecker(String ownerName, double withdrawal){
        boolean flag = false;
        for (String name : ownerNames) {
            if(ownerName.equals(name))flag = true;
        }
        if (flag) withdrawBalance(ownerName, withdrawal);
        else System.out.println("Name is incorrect!!");
    }

    static void withdrawBalance(String ownerName, double withdrawal) {
        int index = 0;
        for (int i = 0; i <= ownerNames.length-1; i++) {
            if (ownerName.equals(ownerNames[i])){
                index = i;
            }
        }
        int balance = balances[index];
        double balanceAfterWithdrawal = balance - withdrawal - withdrawal * 0.05;
        if(balanceAfterWithdrawal >= 0){
            System.out.println(ownerName + " " + withdrawal + " " + balanceAfterWithdrawal);
        }else System.out.println(ownerName + " NO");
    }

    public static void main(String[] args) {
        String ownerName = "Lane";
        double withdrawal = 3048;

        nameChecker(ownerName, withdrawal);
    }
}
