package module_1.practice;

public class Task_4 {
    static String[] getOwnerNames(int[] balances, String[] names){
        int ownerCounter = 0;
        for (int balance: balances) {
            if (balance > 1000)ownerCounter++;
        }
        String[] resultNames = new String[ownerCounter];
        for (int i = 0; i < balances.length; i++) {
            for (int j = 0; j < resultNames.length; j++) {
                if (balances[j] > 1000)resultNames[j] = names[i];
            }
        }
        return resultNames;
    }
    public static void main(String[] args) {
        int[] balances = {1212, 358, 5000, 9657, 4300};
        String[] names = {"John", "Ann", "Jason", "Kate", "Jane"};
        int[] balances1 = {7589, 4521, 6000, 2189, 1248};
        String[] names1 = {"Vlad", "Nick", "Hugh", "Kelly", "Tyler"};

        for (String name: names) {
            System.out.println(getOwnerNames(balances, names));
        }

    }
}
