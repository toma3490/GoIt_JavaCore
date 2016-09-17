package module_5.practice.task_3;

public interface BankSystem {

    void withdrawOfUser(User user, double amount);
    void fundUser(User user, double amount);
    void transferMoney(User fromUser, User toUser, double amount);
    void paySalary(User user);
}
