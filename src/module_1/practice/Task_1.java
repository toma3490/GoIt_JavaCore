package module_1.practice;

public class Task_1 {
    static int balancesSum(int[] balances){
        int sum = 0;
        for (int balance: balances) {
            if (balance > 1000 && balance < 5000){
                sum += balance;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] balances = {1212, 358, 5000, 9657, 4300};
        int[] balances1 = {7589, 4521, 6000, 2189, 1248};
        System.out.println(balancesSum(balances));
        System.out.println(balancesSum(balances1));
//        int sum = 0;
//        int sum1 = 0;
//        for (int i = 0; i < balances.length; i++) {
//            if (balances[i] > 1000 && balances[i] < 5000){
//                sum += balances[i];
//            }
//        }
//        for (int balance: balances) {
//            if (balance > 1000 && balance < 5000){
//                sum += balance;
//            }
//        }
//        System.out.println(sum);
//
//        for (int balance: balances1) {
//            if (balance > 1000 && balance < 5000){
//                sum1 += balance;
//            }
//        }
//        System.out.println(sum1);

    }
}
