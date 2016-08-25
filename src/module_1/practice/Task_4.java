package module_1.practice;

import java.util.Arrays;

public class Task_4 {
        static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        return sum;
    }

    static String[] getOwnerNames(int[] balances, String[] names) {
        int ownersCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownersCount++;
        }

        String[] result = new String[ownersCount];

        int index = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                result[index] = names[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] balances = {1212, 358, 5000, 9657, 4300};
        String[] names = {"John", "Ann", "Jason", "Kate", "Jane"};
        int[] balances1 = {7589, 4521, 6000, 2189, 1248};
        String[] names1 = {"Vlad", "Nick", "Hugh", "Kelly", "Tyler"};

        System.out.println(Arrays.toString(getOwnerNames(balances, names)));
        System.out.println(Arrays.toString(getOwnerNames(balances1, names1)));
    }
}
