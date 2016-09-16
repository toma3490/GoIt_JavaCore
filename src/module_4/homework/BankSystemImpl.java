package module_4.homework;

public class BankSystemImpl implements BankSystem {

    public double conversion (User fromUser, User toUser){
        double course = 1;
        if(fromUser.getBank().getCurrency() == Currency.USD && toUser.getBank().getCurrency() == Currency.EUR){
            course = 0.87;
        }
        if (fromUser.getBank().getCurrency() == Currency.EUR && toUser.getBank().getCurrency() == Currency.USD){
            course = 1.1;
        }
        return course;
    }

    public double withdrawal(User user, double amount){
        return user.getBalance() - amount - amount * user.getBank().getCommission(amount)/100;
    }

    public double fund(User user, double amount){
        return user.getBalance() + amount;
    }

    public void checkLimitOfWithdrawal(User user, double amount){
        if (amount < 0 || amount > user.getBank().getLimitOfWithdrawal()){
            throw new IllegalArgumentException(user.getName() + ", incorrect amount!! Your limit of withdrawal is " + user.getBank().getLimitOfWithdrawal());
        }
    }

    public void checkLimitOfFounding(User user, double amount){
        if (amount < 0 || amount > user.getBank().getLimitOfFunding()){
            throw new IllegalArgumentException(user.getName() + ", incorrect amount!! Your limit of funding is " + user.getBank().getLimitOfFunding());
        }
    }

    public void checkWithdraw(User user, double amount){
        if(withdrawal(user, amount) < 0){
            throw new IllegalArgumentException(user.getName() + ", you have not enough money!! Your balance: " + user.getBalance() + ", you trying withdraw: " + amount);
        }
    }

    @Override
    public void withdrawOfUser(User user, double amount) {
        checkLimitOfWithdrawal(user, amount);
        checkWithdraw(user, amount);
        user.setBalance(withdrawal(user, amount));
    }

    @Override
    public void fundUser(User user, double amount) {
        checkLimitOfFounding(user, amount);
        user.setBalance(fund(user, amount));
    }

    @Override
    public void transferMoney(User fromUser, User toUser, double amount) {
//        checkLimitOfWithdrawal(fromUser, amount);
//        checkWithdraw(fromUser, amount);
//        checkLimitOfFounding(toUser, amount);
//        fromUser.setBalance(withdrawal(fromUser, amount));
//        toUser.setBalance(fund(toUser, amount));
        withdrawOfUser(fromUser, amount);
        fundUser(toUser, amount * conversion(fromUser, toUser));
    }

    @Override
    public void paySalary(User user) {
        fundUser(user, user.getSalary());
    }
}
