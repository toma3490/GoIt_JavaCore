package module_4.homework;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank("New York", Currency.USD, 350, 15000, 10, 10540089);
        Bank euBank = new EUBank("Germany", Currency.EUR, 395, 14500, 10, 10007521);
        Bank chinaBank = new ChinaBank("Hong Kong", Currency.USD, 250, 8000, 7, 7005000);

        usBank.setId();
        euBank.setId();
        chinaBank.setId();

        System.out.println(usBank.infoToString());
        System.out.println(euBank.infoToString());
        System.out.println(chinaBank.infoToString() + '\n');

        System.out.println(usBank.dataToString());
        System.out.println(euBank.dataToString());
        System.out.println(chinaBank.dataToString() + '\n');

        BankSystemImpl bankSystem = new BankSystemImpl();

        User user1 = new User("Bruce Wayne", 7500, 24, "WayneTech", 5000, usBank);
        User user2 = new User("Clark Kent", 5000, 13, "Daily Planet", 2500, usBank);
        User user3 = new User("James Bond", 4000, 4, "MI6", 2000, euBank);
        User user4 = new User("Van Helsing", 1000, 8, "VampSl", 500, euBank);
        User user5 = new User("Kenuichio Harada", 2500, 15, "Yakuza", 1250, chinaBank);
        User user6 = new User("Amiko Kobayashi", 3500, 3, "Yakuza", 1775, chinaBank);

        user1.setId();
        user2.setId();
        user3.setId();
        user4.setId();
        user5.setId();
        user6.setId();

        bankSystem.withdrawOfUser(user1, 850);
        bankSystem.fundUser(user1, 1000);
        bankSystem.transferMoney(user1, user2, 500);
        bankSystem.paySalary(user1);

        bankSystem.withdrawOfUser(user2, 900);
        bankSystem.fundUser(user2, 5000);
        bankSystem.transferMoney(user2, user3, 500);
        bankSystem.paySalary(user2);

        bankSystem.withdrawOfUser(user3, 2000);
        bankSystem.fundUser(user3, 1050);
        bankSystem.transferMoney(user3, user4, 100);
        bankSystem.paySalary(user3);

        bankSystem.withdrawOfUser(user4, 200);
        bankSystem.fundUser(user4, 4200);
        bankSystem.transferMoney(user4, user5, 400);
        bankSystem.paySalary(user4);

        bankSystem.withdrawOfUser(user5, 50);
        bankSystem.fundUser(user5, 10000);
        bankSystem.transferMoney(user5, user6, 25);
        bankSystem.paySalary(user5);

        bankSystem.withdrawOfUser(user6, 99.9);
        bankSystem.fundUser(user6, 800);
        bankSystem.transferMoney(user6, user1, 100);
        bankSystem.paySalary(user6);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
        System.out.println(user6.toString());
    }
}
