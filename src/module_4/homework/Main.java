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
        System.out.println(chinaBank.infoToString());

        System.out.println(usBank.dataToString());
        System.out.println(euBank.dataToString());
        System.out.println(chinaBank.dataToString());

        BankSystemImpl bankSystem = new BankSystemImpl();

        User user1 = new User("Bruce Wayne", 1500000, 24, "WayneTech", 100000, usBank);
        User user2 = new User("Clark Kent", 20000, 13, "Daily Planet", 3500, usBank);
        User user3 = new User("James Bond", 100200.5, 4, "MI6", 10000, euBank);
        User user4 = new User("Van Helsing", 1002.45, 8, "VampSl", 1200, euBank);
        User user5 = new User("Kenuichio Harada", 5500, 15, "Yakuza", 12000, chinaBank);
        User user6 = new User("Amiko Kobayashi", 3500, 3, "Yakuza", 4500, chinaBank);

        bankSystem.withdrawOfUser(user1, 2000);
        System.out.println(user1.toString());

    }
}
